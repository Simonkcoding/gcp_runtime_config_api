package com.example.gcp_runtime_config_demo_2.controller;

import com.example.gcp_runtime_config_demo_2.model.Vehicle;
import com.example.gcp_runtime_config_demo_2.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController
public class VehicleController {

    @Autowired
    VehicleRepository repo;

    @PostMapping("/vehicle")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return repo.save(vehicle);
    }

    @GetMapping("/vehicle")
    public List<Vehicle> getAllVehicle(){
        return repo.findAll();
    }

    @Value("${mongodb-collection}")
    private String collection;
    @Value("${mongodb-user}")
    private String user;

    @GetMapping("/ping")
    public String getConllection(){
        return "Hello! MongoDB user: "+this.user+"! You are using collection: "+this.collection+"!";
    }

}
