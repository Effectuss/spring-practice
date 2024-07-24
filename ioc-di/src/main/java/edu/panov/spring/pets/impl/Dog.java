package edu.panov.spring.pets.impl;

import edu.panov.spring.pets.Pet;
import org.springframework.stereotype.Component;

public class Dog implements Pet {
    public Dog() {
        System.out.println("The Dog Constructor");
    }

    @Override
    public void say() {
        System.out.println("GAV-GAV");
    }
}
