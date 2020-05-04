package com.example.gcp_runtime_config_demo_2.repository;

import com.example.gcp_runtime_config_demo_2.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle,String> {

}
