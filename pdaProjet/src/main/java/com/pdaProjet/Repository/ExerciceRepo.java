package com.pdaProjet.Repository;

import com.pdaProjet.Dao.ExercicesDao;
import com.pdaProjet.Entitys.Exercices;

import java.util.ArrayList;

public class ExerciceRepo {



    private ExercicesDao exercicesDao = new ExercicesDao();

    public Exercices add(Exercices exercices){

        return exercicesDao.insertEntity(exercices);
    }

    public ArrayList<Exercices> showAllExercie() {
        return exercicesDao.showAllExerice();
    }
}



