package com.example.gcp_runtime_config_demo_2.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "toyota")
public class Vehicle {
    private String id;
    private String model;
    private String pictureUrl;
}
