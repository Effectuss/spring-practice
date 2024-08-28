package edu.panov.spring.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        students = List.of(
                new Student("sava", 2, 3.5),
                new Student("masha", 33, 3.55),
                new Student("Vlad", 25, 9.99)
        );
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }

    public List<Student> getStudents(boolean throwing) {
        if (throwing) {
            throw new RuntimeException("Throwing exception from " + this.getClass());
        }
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }
}
