package edu.icet.ecom.config;

import edu.icet.ecom.model.entity.Member;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilMember {
    private static SessionFactory sessionFactory;
    private HibernateUtilMember(){}

    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Member.class);
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }

}
