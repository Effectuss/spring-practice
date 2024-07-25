package edu.panov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        var library = context.getBean("library", Library.class);

        library.printBook();

        context.close();
    }
}