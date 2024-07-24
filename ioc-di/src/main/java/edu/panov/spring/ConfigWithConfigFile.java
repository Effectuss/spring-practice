package edu.panov.spring;

import edu.panov.spring.configurations.MyConfig;
import edu.panov.spring.person.Person;
import edu.panov.spring.pets.Pet;
import edu.panov.spring.pets.impl.Cat;
import edu.panov.spring.pets.impl.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithConfigFile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat1 = annotationConfigApplicationContext.getBean("catBean", Cat.class);
        Person person = annotationConfigApplicationContext.getBean("personBean", Person.class);

        cat1.say();

        annotationConfigApplicationContext.close();
    }
}
