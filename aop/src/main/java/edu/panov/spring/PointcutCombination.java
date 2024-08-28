package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.service.SchoolLibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutCombination {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        SchoolLibraryService schoolLibraryService =
                context.getBean("schoolLibraryService", SchoolLibraryService.class);
        schoolLibraryService.returnMagazine();

        context.close();
    }
}
