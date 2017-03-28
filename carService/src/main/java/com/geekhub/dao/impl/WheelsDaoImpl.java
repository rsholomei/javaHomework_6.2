package com.geekhub.dao.impl;

import com.geekhub.dao.WheelsDao;
import com.geekhub.dao.mapper.WheelsMapper;
import com.geekhub.model.Wheels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Service
@Transactional
public class WheelsDaoImpl extends JdbcDaoSupport implements WheelsDao {
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void saveWheels(Wheels wheels) {
        try {
            this.getJdbcTemplate().update
                    ("INSERT INTO Wheels (Tyres_ID) VALUES(?)",
                            new Object[] { wheels.getTyresId() });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateWheels(int wheelsId, int tyresId) {
        try {
            this.getJdbcTemplate().update("update Wheels set Tyres_ID where Wheels_ID = ?",
                    tyresId, wheelsId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteWheels(int wheelsId) {
        try {
            this.getJdbcTemplate().update("delete from Wheels where Wheels_ID = ?",
                    wheelsId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Wheels findWheelsById(int wheelsId) {
        return this.getJdbcTemplate().queryForObject("select * from Wheels where Wheels_ID = ?",
                new Object[]{wheelsId}, new WheelsMapper());
    }

    @Override
    public List<Wheels> getAllWheels() {
        return this.getJdbcTemplate().query("select * from Wheels",
                new WheelsMapper());
    }
}
