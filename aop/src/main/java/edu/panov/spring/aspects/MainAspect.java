package edu.panov.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MainAspect {
    @Before("edu.panov.spring.aspects.pointcut.MyPointcut.allGetMethod()")
    public void beforGetMethodFirstOrderAdvice() {
        System.out.println("beforGetMethodFirstOrderAdvice call");
    }
}
