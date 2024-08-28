package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.service.SchoolLibraryService;
import edu.panov.spring.service.UniversityLibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutOrderTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibraryService universityLibraryService = context.getBean(UniversityLibraryService.class);
        SchoolLibraryService schoolLibraryService = context.getBean(SchoolLibraryService.class);
        universityLibraryService.getBook();
        schoolLibraryService.getBook();

        context.close();
    }
}
