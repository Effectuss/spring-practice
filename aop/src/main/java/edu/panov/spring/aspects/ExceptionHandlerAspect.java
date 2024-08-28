package edu.panov.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(Integer.MAX_VALUE)
public class ExceptionHandlerAspect {
    @Before("edu.panov.spring.aspects.pointcut.MyPointcut.allGetMethod()")
    private void beforGetMethodLastOrderAdvice() {
        System.out.println("Before get method last order advice");
    }
}
