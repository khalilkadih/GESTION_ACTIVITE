package com.pdaProjet.Repository;

import com.pdaProjet.Dao.LoginDao;
import com.pdaProjet.Entitys.User;
import com.pdaProjet.Hibernate.HibernateFactory;
import jakarta.persistence.Query;
import org.hibernate.Session;

public class LoginRepo {
    private LoginDao loginDao = new LoginDao();
    public int login(String email,String password){
        User user= new LoginRepo().findByEmail(email);
        if(user.getEmail()==null){
            return 0;
        };
        return (user.getPassword().equals(password)) ? 1:2;
    }


    public User findByEmail(String email) {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from User where email =:email",User.class);
        query.setParameter("email", email);

        User user = (User) query.getSingleResult();

        session.close();

        return user;
    }
}
