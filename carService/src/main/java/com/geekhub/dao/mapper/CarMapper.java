package com.geekhub.dao.mapper;

import com.geekhub.model.Car;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
        Car car = new Car();
        car.setId(rs.getLong("Car_ID"));
        car.setNameCar(rs.getString("NameCar"));
        car.setWheelId(rs.getLong("Wheels_ID"));
        car.setEngineId(rs.getLong("Engine_ID"));
        return car;
    }
}
