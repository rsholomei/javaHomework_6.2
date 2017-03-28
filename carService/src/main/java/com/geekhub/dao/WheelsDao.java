package com.geekhub.dao;

import com.geekhub.model.Wheels;

import java.util.List;

public interface WheelsDao {
    void saveWheels(Wheels wheel);
    void updateWheels(int wheelsId, int tyresId);
    void deleteWheels(int wheelsId);
    Wheels findWheelsById(int wheelsId);
    List<Wheels> getAllWheels();
}
