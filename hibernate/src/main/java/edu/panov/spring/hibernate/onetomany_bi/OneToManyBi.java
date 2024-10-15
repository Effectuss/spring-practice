package edu.panov.spring.hibernate.onetomany_bi;

import edu.panov.spring.hibernate.onetomany_bi.entity.Department;
import edu.panov.spring.hibernate.onetomany_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyBi {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            // part 1
//            Department department = new Department("IT", 300, 1200);
//            Employee employee = new Employee("Sava", "Panov", 900);
//            Employee employee2 = new Employee("Kostya", "Vasiliev", 300);
//
//            department.addEmployee(employee);
//            department.addEmployee(employee2);

            session.beginTransaction();

            // part 2
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//
            // part 1
//            session.persist(department);


            // delete part 3
            // За счет того что стоит Cascade.ALL мы вообще все удалим
//            Employee employee = session.get(Employee.class, 1);
//            session.remove(employee);

            // delete part 4
            // Удаление без каскада
            Employee employee = session.get(Employee.class, 1);
            session.remove(employee);

            session.getTransaction().commit();
        }
    }
}
