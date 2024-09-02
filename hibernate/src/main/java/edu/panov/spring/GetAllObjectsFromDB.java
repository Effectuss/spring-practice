package edu.panov.spring;

import edu.panov.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetAllObjectsFromDB {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            try (Session session = sessionFactory.getCurrentSession()) {
                session.beginTransaction();

                List<Employee> employees = session.createQuery(
                        "from Employee where name = 'Michael'" , Employee.class
                ).getResultList();

                employees.forEach(System.out::println);

                session.getTransaction().commit();

            }
        }
    }
}
