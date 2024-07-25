package edu.panov.spring;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class Library {
    public void printBook() {
        System.out.println("We are taking book!");
    }
}
