package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.service.UniversityLibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AroundAspectTest {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        var library = context.getBean("universityLibraryService", UniversityLibraryService.class);

        System.out.println(library.returnHardCodeBook());

        context.close();
        System.out.println("Method main ends");
    }
}
