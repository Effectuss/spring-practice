package edu.panov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.panov.spring.pets.impl.Dog;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        var dog1 = context.getBean("dog", Dog.class);
        var dog2 = context.getBean("dog", Dog.class);

        context.close();
    }
}
