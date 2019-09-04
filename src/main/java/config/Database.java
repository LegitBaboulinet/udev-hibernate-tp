package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Database {
    private static Configuration config = new Configuration().configure("hibernate.cfg.xml");
    public static SessionFactory sessionFactory = config.buildSessionFactory();
}
