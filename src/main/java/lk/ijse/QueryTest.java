package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class QueryTest {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        //HQL, JPQL
        //use entity class name
        Query<Customer> fromCustomer = session.createQuery("from Customer", Customer.class);
        List<Customer> list = fromCustomer.list();

        //SQL
        session.createNativeQuery("select * from customer");
    }
}