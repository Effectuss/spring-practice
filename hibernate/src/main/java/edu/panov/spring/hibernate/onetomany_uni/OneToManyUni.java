package edu.panov.spring.hibernate.onetomany_uni;

import edu.panov.spring.hibernate.onetomany_uni.entity.Department;
import edu.panov.spring.hibernate.onetomany_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyUni {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            Department department = new Department("HR", 1000, 200);
            Employee employee = new Employee("Natasha", "Petrova", 900);
            Employee employee1 = new Employee("Olga", "Ivanova", 200);

            department.addEmployee(employee);
            department.addEmployee(employee1);

            session.beginTransaction();

            session.persist(department);

            session.getTransaction().commit();
        }
    }
}
