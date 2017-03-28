package com.geekhub.dao;

import com.geekhub.model.Car;

import java.util.List;

public interface CarDao {
    void saveCar(Car car);
    void updateCar(int carId, int wheelsId, int engineId);
    void deleteCarById(int carId);
    Car findCarById(int carId);
    List<Car> getAllCar();
}
