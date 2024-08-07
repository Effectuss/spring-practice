package edu.panov.spring;

import edu.panov.spring.person.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
