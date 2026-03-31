package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LifeCycle {
    public static void main(String[] args) {
        //Transient state
        //no session
        //no db
        //hibernate no track changes
        Customer customer = new Customer();
        customer.setName("Kamal");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //Persistence state
        //have session
        //have DB
        //object is now managed by hibernate
        session.persist(customer);
        transaction.commit();

        //detached state
        session.close();
        //no change track
        customer.setName("");

        Session newSession = FactoryConfiguration.getInstance().getSession();
        Transaction newTransaction = session.beginTransaction();

        //persistence state
        newSession.merge(customer);
        /*newSession.persist();
        newSession.save();*/

        //Remove state
        newSession.remove(customer); // ready to delete
        //newSession.delete(customer);

        newTransaction.commit(); // after commit remove db data

        Session newSession2 = FactoryConfiguration.getInstance().getSession();

        //persistence state
        Customer customer2 = newSession2.get(Customer.class, 1);
    }
}