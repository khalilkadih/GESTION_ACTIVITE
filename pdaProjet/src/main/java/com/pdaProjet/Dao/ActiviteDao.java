package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;

public class ActiviteDao {

    public Activite insertEntity(Activite activite){
        EntityManager entityManager =JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(activite);
        entityManager.getTransaction().commit();
        entityManager.close();
        return activite;
    }
    public ArrayList<Activite> showAllActivite(){

        EntityManager entityManager=JpaUtil.getEntityManagerFactory().createEntityManager();
         return (ArrayList<Activite>) entityManager.createQuery("select a from Activite a",Activite.class).getResultList();
         }



    public Activite findEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        Activite activité = entityManager.find(Activite.class, id);
        entityManager.close();
        return activité;
    }



    public void updateEntity(Activite activite) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(activite);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void removeEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Activite Activité = entityManager.find(Activite.class, id);
        entityManager.remove(Activité);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
