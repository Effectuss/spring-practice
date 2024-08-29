package edu.panov.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAroundAspect {

    @Around("execution (String returnHardCodeBook())")
    public Object aroundReturnHardCodeBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnHardCodeBook: в библиотеку пытаются вернуть книгу");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("aroundReturnHardCodeBook: в библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
