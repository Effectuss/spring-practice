package edu.panov.spring.aspects.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* get*())")
    public void allGetMethod() {}
}
