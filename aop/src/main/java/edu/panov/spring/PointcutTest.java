package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.service.SchoolLibraryService;
import edu.panov.spring.service.UniversityLibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibraryService universityLibraryService =
                context.getBean(UniversityLibraryService.class);

        universityLibraryService.printBook();
        universityLibraryService.returnBook();
        universityLibraryService.printMagazine();

        SchoolLibraryService schoolLibraryService =
                context.getBean(SchoolLibraryService.class);
        schoolLibraryService.printBook();

        context.close();
    }
}
