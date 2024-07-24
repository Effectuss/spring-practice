package edu.panov.spring;

import edu.panov.spring.pets.Pet;
import edu.panov.spring.pets.impl.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Pet myCat = context.getBean("myPet", Cat.class);
//        myCat.setName("Belka");
        Cat yourCat = context.getBean("myPet", Cat.class);
//        yourCat.setName("Strelka");

//        System.out.println(myCat.getName());
//        System.out.println(yourCat.getName());

//        System.out.println(myCat == yourCat);
//        System.out.println(myCat);
//        System.out.println(yourCat);
    }
}
