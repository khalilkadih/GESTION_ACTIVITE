package com.pdaProjet.Repository;

import com.pdaProjet.Dao.ActiviteDao;
import com.pdaProjet.Entitys.Activite;

import java.util.ArrayList;

public class ActiviteRepo {
    private ActiviteDao activiteDao = new ActiviteDao();

    public Activite add(Activite activite){
        return activiteDao.insertEntity(activite);
    }

//to do
    public ArrayList<Activite> showAllActivite() {
        return activiteDao.showAllActivite();
    }

}
