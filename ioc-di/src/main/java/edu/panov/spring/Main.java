package edu.panov.spring;

import edu.panov.spring.person.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        Person personWithoutName = context.getBean("myPersonWithoutName", Person.class);
        person.callPet();

        System.out.println(person.getAge());
        System.out.println(person.getName());

        personWithoutName.callPet();
        System.out.println(personWithoutName.getName());

        context.close();
    }
}