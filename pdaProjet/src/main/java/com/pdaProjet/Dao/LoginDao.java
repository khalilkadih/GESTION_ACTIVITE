package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LoginDao {

    public User find(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PDA");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();

        return user;
    }


}
