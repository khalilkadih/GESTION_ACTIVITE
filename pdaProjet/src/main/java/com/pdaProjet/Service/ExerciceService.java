package com.pdaProjet.Service;


import com.pdaProjet.Dao.ExercicesDao;
import com.pdaProjet.Entitys.Exercices;
import com.pdaProjet.Repository.ExerciceRepo;

import java.util.ArrayList;

public class ExerciceService {
    private ExerciceRepo exerciceRepo = new ExerciceRepo();

    public Exercices addExercicese(Exercices exercices){
        return exerciceRepo.add(exercices);
    }

    public ArrayList<Exercices> showAllExercicese(){
        return  exerciceRepo.showAllExercie();
    }

    public void updateExercicese( Exercices exercicese){
        new ExercicesDao().updateEntity(exercicese);


    }

    public Exercices findEntity(long id) {

        return new ExercicesDao().findEntity(id);
    }


    public void delete(long id) {

        new ExercicesDao().removeEntity(id);
    }
}
