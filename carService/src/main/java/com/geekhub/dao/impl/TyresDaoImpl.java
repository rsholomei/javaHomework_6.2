package com.geekhub.dao.impl;

import com.geekhub.dao.TyresDao;
import com.geekhub.dao.mapper.TyresMapper;
import com.geekhub.model.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Service
@Transactional
public class TyresDaoImpl extends JdbcDaoSupport implements TyresDao {
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void saveTyres(Tyres tyres) {
        try {
            this.getJdbcTemplate().update
                    ("INSERT INTO Tyres (SizeTyres, NameTyres) VALUES(?,?)",
                            new Object[] { tyres.getSize(), tyres.getName() });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateTyres(int tyresId, String name) {
        try {
            this.getJdbcTemplate().update("update Tyres set NameTyres = ? where Tyres_ID = ? ",
                    name, tyresId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTyres(int tyresId) {
        try {
            this.getJdbcTemplate().update("delete from Tyres where Tyres_ID = ?",
                    tyresId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Tyres findTyresById(int tyresId) {
        return this.getJdbcTemplate().queryForObject("select * from Tyres where Tyres_ID = ?",
                new Object[]{tyresId}, new TyresMapper());
    }

    @Override
    public List<Tyres> getAllTyres() {
        return this.getJdbcTemplate().query("select * from Tyres",
                new TyresMapper());
    }
}
