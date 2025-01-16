package edu.panov.spring.hibernate.manytomany;

import edu.panov.spring.hibernate.manytomany.entity.Child;
import edu.panov.spring.hibernate.manytomany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

//            Section section1 = new Section("Tennis");
//            Section section2 = new Section("Football");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Sava", 20);
//
//            child1.addSectionToChild(section3);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);

            // переместить после beginTransaction
//            session.persist(child1);
            session.beginTransaction();

            Section section = session.get(Section.class, 2);

            System.out.println("PRINT " + section.getChildrenList());

            session.getTransaction().commit();
        }
    }
}
