package edu.panov.spring;

import edu.panov.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Michael", "Panov", "IT", 550);

            session.beginTransaction();

            session.persist(employee);

            session.getTransaction().commit();
        }
    }
}