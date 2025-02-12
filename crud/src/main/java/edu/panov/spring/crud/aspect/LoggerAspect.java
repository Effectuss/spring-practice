package edu.panov.spring.crud.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

    @Around("execution(* edu.panov.spring.crud.dao.*.* (..))")
    public Object aroundAllEmployeeRepositoryMethodsAdvice(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        String methodName = methodSignature.getName();

        System.out.println("Begin of " + methodName);

        Object targetMethodResult = pjp.proceed();

        System.out.println(targetMethodResult);

        System.out.println("End of " + methodName);

        return targetMethodResult;
    }
}
