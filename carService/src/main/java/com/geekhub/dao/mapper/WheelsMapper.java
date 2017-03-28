package com.geekhub.dao.mapper;

import com.geekhub.model.Wheels;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WheelsMapper implements RowMapper<Wheels> {
    @Override
    public Wheels mapRow(ResultSet rs, int rowNum) throws SQLException {
        Wheels wheels = new Wheels();
        wheels.setId(rs.getLong("Wheels_ID"));
        wheels.setTyresId(rs.getLong("Tyres_ID"));
        return wheels;
    }
}
