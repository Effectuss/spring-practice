package edu.panov.spring.hibernate.onetoone;

import edu.panov.spring.hibernate.onetoone.entity.Detail;
import edu.panov.spring.hibernate.onetoone.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDirectional {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            Employee employee = new Employee("Sava", "Panov", "stroika", 123);
            Detail detail = new Detail("Nsk", "132", "aboba007@gmail.rossia");

            detail.setEmployee(employee);
            employee.setEmployeeDetail(detail);
            session.beginTransaction();

            session.remove(session.get(Detail.class, 3));

            session.getTransaction().commit();
        }
    }
}
