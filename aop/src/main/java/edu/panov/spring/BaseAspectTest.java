package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.service.UniversityLibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseAspectTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        var library = context.getBean("universityLibraryService", UniversityLibraryService.class);

        library.printBook();

        context.close();
    }
}