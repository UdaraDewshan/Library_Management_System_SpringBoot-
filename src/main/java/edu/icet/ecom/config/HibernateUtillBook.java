package edu.icet.ecom.config;

import edu.icet.ecom.model.entity.Book;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtillBook {

    private static SessionFactory sessionFactory;
    private HibernateUtillBook(){}

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Book.class);
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }

}
