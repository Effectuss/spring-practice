package edu.panov.spring;

import edu.panov.spring.config.MyConfig;
import edu.panov.spring.model.Book;
import edu.panov.spring.service.UniversityLibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutWithParameterTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibraryService universityLibraryService =
                context.getBean(UniversityLibraryService.class);
        Book book = context.getBean("book", Book.class);

        universityLibraryService.printNeedBook(book);
        universityLibraryService.printNeedBook("Война и мир");

        context.close();
    }
}
