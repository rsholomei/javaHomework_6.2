package com.geekhub.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties.car")
public class Car {
    private Long id;
    private String nameCar;
    private Long wheels_Id;
    private Long engine_Id;

    public Car(String nameCar, Long wheels_Id, Long engine_Id){
        this.nameCar = nameCar;
        this.wheels_Id = wheels_Id;
        this.engine_Id = engine_Id;
    }

    public Car(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWheelId() {
        return wheels_Id;
    }

    public void setWheelId(Long wheels_Id) {
        this.wheels_Id = wheels_Id;
    }

    public Long getEngineId() {
        return engine_Id;
    }

    public void setEngineId(Long engine_Id) {
        this.engine_Id = engine_Id;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nameCar='" + nameCar + '\'' +
                ", wheels_Id=" + wheels_Id +
                ", engine_Id=" + engine_Id +
                '}';
    }
}
