package com.geekhub.dao;

import com.geekhub.model.Tyres;

import java.util.List;

public interface TyresDao {
    void saveTyres(Tyres tyres);
    void updateTyres(int tyresId, String name);
    void deleteTyres(int tyresId);
    Tyres findTyresById(int tyresId);
    List<Tyres> getAllTyres();
}
