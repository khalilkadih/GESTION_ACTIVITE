package com.pdaProjet.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import com.pdaProjet.Entitys.User;
import com.pdaProjet.Util.JpaUtil;

public class UserDao {

    public User  insertEntity(User user){

        EntityManager entityManager =JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    public void findEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
    }



    public void updateEntity(long id) {


        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, id);
        entityManager.merge(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


}