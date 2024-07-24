package edu.panov.spring.pets.impl;

import edu.panov.spring.pets.Pet;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Dog implements Pet {
    public Dog() {
        System.out.println("The Dog Constructor");
    }

    @Override
    public void say() {
        System.out.println("GAV-GAV");
    }

    @PostConstruct
    void init() {
        System.out.println("Init dog");
    }

    @PreDestroy
    void destroy() {
        System.out.println("Destroy");
    }
}
