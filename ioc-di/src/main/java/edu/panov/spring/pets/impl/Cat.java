package edu.panov.spring.pets.impl;

import edu.panov.spring.pets.Pet;
import org.springframework.stereotype.Component;

//@Component("cat")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat constructor");
    }

    @Override
    public void say() {
        System.out.println("MEOW-MEOW");
    }

    private void init() {
        System.out.println("Class Cat init");
    }

    private void destroy() {
        System.out.println("Class Cat destroy");
    }
}
