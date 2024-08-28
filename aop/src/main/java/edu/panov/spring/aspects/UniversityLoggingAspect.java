package edu.panov.spring.aspects;

import edu.panov.spring.model.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice(JoinPoint joinPoint) {
        System.out.println("Before getStudents ");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsAdvice(JoinPoint joinPoint, List<Student> students) {
        Student student = students.get(0);

        String name = student.getName();
        name = "Mr. " + name;
        student.setName(name);

        System.out.println("After returning getStudents");
    }

    @AfterThrowing(pointcut = "execution(* getStudents(..))", throwing = "exception")
    public void afterThrowingGetStudentsAdvice(JoinPoint joinPoint, Throwable exception) {
        System.out.println(exception.getMessage());
        System.out.println("AfterThrowingGetStudentsAdvice getStudents");
    }
}
