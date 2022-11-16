package com.pdaProjet.Service;

import com.pdaProjet.Dao.ActiviteDao;
import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Repository.ActiviteRepo;

import java.util.ArrayList;

public class ActiviteService {
    private ActiviteRepo activiteRepo = new ActiviteRepo();

    public Activite addActivite(Activite activite){
        return activiteRepo.add(activite);
    }

    public ArrayList<Activite> showAllActivite(){
        return  activiteRepo.showAllActivite();
    }

    public void updateActivite( Activite activite){
     new ActiviteDao().updateEntity(activite);


    }

    public Activite findEntity(long id) {

        return new ActiviteDao().findEntity(id);
    }


    public void delete(long id) {
        new ActiviteDao().removeEntity(id);
    }
}
