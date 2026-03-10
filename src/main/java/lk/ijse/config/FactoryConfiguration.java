package lk.ijse.config;

import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// HibernateUtill
//    global accessible single instance - singleton
public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory; // session

    private FactoryConfiguration() {
        // Hibernate Bootstrapping & Schema Strategies
        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");

        configuration.addAnnotatedClass(Customer.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return factoryConfiguration == null ?
                factoryConfiguration = new FactoryConfiguration() :
                factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}