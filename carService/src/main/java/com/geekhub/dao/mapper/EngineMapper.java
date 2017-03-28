package com.geekhub.dao.mapper;

import com.geekhub.model.Engine;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EngineMapper implements RowMapper<Engine>{
    @Override
    public Engine mapRow(ResultSet rs, int rowNum) throws SQLException {
        Engine engine = new Engine();
        engine.setId(rs.getLong("Engine_ID"));
        engine.setEngineСapacity(rs.getDouble("EngineСapacity"));
        return engine;
    }
}
