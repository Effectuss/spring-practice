package edu.panov.spring;

import edu.panov.spring.pets.impl.Cat;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Cat myCat = context.getBean("myPet", Cat.class);
        myCat.say();

        Cat yourCat = context.getBean("myPet", Cat.class);
        yourCat.say();
        context.close();
    }
}
