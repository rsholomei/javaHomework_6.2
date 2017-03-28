package com.geekhub.dao.mapper;

import com.geekhub.model.Tyres;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TyresMapper implements RowMapper<Tyres> {
    @Override
    public Tyres mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tyres tyres = new Tyres();
        tyres.setId(rs.getLong("Tyres_ID"));
        tyres.setSize(rs.getInt("SizeTyres"));
        tyres.setName(rs.getString("NameTyres"));
        return tyres;
    }
}
