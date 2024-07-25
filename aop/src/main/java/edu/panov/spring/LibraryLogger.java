package edu.panov.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LibraryLogger {

    @Before("execution(public void printBook())")
    public void beforePrintBookAdvice() {
        System.out.println("Logged to Library");
    }
}
