package edu.panov.spring;

import edu.panov.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObjectFromDB {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(
                Employee.class).buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

//            Employee newEmployee = session.get(Employee.class, 1);
//            session.remove(newEmployee);

            session.createMutationQuery("delete from Employee where salary = 123").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
