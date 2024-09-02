package edu.panov.spring;

import edu.panov.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetObjectFromDB {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            try (Session session = sessionFactory.getCurrentSession()) {
                session.beginTransaction();
                Employee employee = new Employee("Mike", "Vazovski", "Build", 100);
                session.persist(employee);

                Employee newEmployee = session.get(Employee.class,1);
                session.getTransaction().commit();

                System.out.println(newEmployee.toString());
            }
        }
    }
}
