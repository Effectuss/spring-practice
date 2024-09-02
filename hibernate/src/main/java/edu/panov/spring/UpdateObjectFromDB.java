package edu.panov.spring;

import edu.panov.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateObjectFromDB {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(
                Employee.class).buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

            session.createMutationQuery("update Employee set salary = 123 where name = 'Mike'")
                    .executeUpdate();

            session.getTransaction().commit();
        }
    }
}
