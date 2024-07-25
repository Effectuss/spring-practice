package edu.panov.spring.person;

import edu.panov.spring.pets.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;

    private String name;

    private int age;

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Person created!");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Default constructor");
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void callPet() {
        pet.say();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}