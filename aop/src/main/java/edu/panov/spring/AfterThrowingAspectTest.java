package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.model.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterThrowingAspectTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean(University.class);
        university.addStudents();

        var students = university.getStudents(true);
        System.out.println(students);

        context.close();
    }
}