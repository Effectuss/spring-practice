package edu.panov.spring.configurations;

import edu.panov.spring.person.Person;
import edu.panov.spring.pets.Pet;
import edu.panov.spring.pets.impl.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("edu.panov.spring")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("Cat bean config");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        System.out.println("Person bean config");
        return new Person(catBean());
    }


}
