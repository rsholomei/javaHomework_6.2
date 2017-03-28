package com.geekhub.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties.engine")
public class Engine {
    private Long id;
    private Double engineСapacity;

    public Engine(Double engineСapacity){
        this.engineСapacity = engineСapacity;
    }

    public Engine(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(Double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "EngineCapacity: " + engineСapacity;
    }
}
