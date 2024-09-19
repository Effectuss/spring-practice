package edu.panov.spring.hibernate.onetoone;

import edu.panov.spring.hibernate.onetoone.entity.Detail;
import edu.panov.spring.hibernate.onetoone.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniDirectional {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            Employee employee = new Employee("Zaur", "Tregulov", "IT", 500);
            Detail detail = new Detail("Baku", "123123", "aboba@gmail.ru");

            employee.setEmployeeDetail(detail);
            session.beginTransaction();

            var emp = session.get(Employee.class, 2);
            session.remove(emp);
            System.out.println(emp);

            session.getTransaction().commit();
        }
    }
}
