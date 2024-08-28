package edu.panov.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LibraryLoggerAndSecurityChecker {

//    @Pointcut("execution(* edu.panov.spring.service.SchoolLibraryService.*(..))")
//    private void allMethodsSchoolLibrary() {
//    }
//
//    @Pointcut("execution(* edu.panov.spring.service.SchoolLibraryService.returnMagazine(..))")
//    private void returnMethodsSchoolLibrary() {
//    }
//
//    @Pointcut("(allMethodsSchoolLibrary() && (!returnMethodsSchoolLibrary()))")
//    private void allMethodsWithoutReturnMethod() {
//    }
//
//    @Before("allMethodsWithoutReturnMethod()")
//    void beforeAllMethodsWithoutReturnMethodSchoolLibrary() {
//        System.out.println("beforeAllMethodsWithoutReturnMethodSchoolLibrary");
//    }
//
//    @Pointcut("execution(* edu.panov.spring.service.SchoolLibraryService.get*())")
//    private void getMethodSchoolLibraryService() {}
//
//    @Pointcut("execution(* edu.panov.spring.service.SchoolLibraryService.return*())")
//    private void returnMethodSchoolLibraryService() {}
//
//    @Pointcut("getMethodSchoolLibraryService() || returnMethodSchoolLibraryService()")
//    private void getMethodAndReturnSchoolLibraryService() {}
//
//    @Before("getMethodAndReturnSchoolLibraryService()")
//    void beforeGetMethodAndReturnSchoolLibraryServiceAdvice() {
//        System.out.println("beforeGetMethodAndReturnSchoolLibraryServiceAdvice");
//    }
//
//    @Before("execution(public void printBook())")
//    void beforePrintBookAdvice() {
//        System.out.println("beforePrintBookAdvice");
//    }
//
//    @Before("execution(public void edu.panov.spring.service.UniversityLibraryService.returnBook())")
//    void beforeReturnBookForUniversityAdvice() {
//        System.out.println("beforePrintBookForUniversityAdvice");
//    }
//
//    @Before("execution(public void print*())")
//    void beforeExecutionPrintAdvice() {
//        System.out.println("beforeExecutionPrintAdvice");
//    }
//
//    @Before("execution(public * *())")
//    void beforePublicMethodCallAdvice() {
//        System.out.println("beforePublicMethodCallAdvice");
//    }
//
//    @Before("execution(* *())")
//    void beforeAllMethodCallAdvice() {
//        System.out.println("beforeAllMethodCallAdvice");
//    }
//
//
//    @Before("execution(public * printNeedBook(edu.panov.spring.model.Book))")
//    void beforePrintNeedBookAdvice() {
//        System.out.println("beforePrintNeedBookAdvice");
//    }
//
//    @Before("execution(public * printNeedBook(..))")
//    void beforePrintNeedBookWithInfinityParameterAdvice() {
//        System.out.println("beforePrintNeedBookWithInfinityParameterAdvice");
//    }
//
//    @Pointcut("execution(* *(..))")
//    void allMethod() {}
//
//    @Before("allMethod()")
//    void beforeLoggingAdvice() {
//        System.out.println("beforeLoggingAdvice");
//    }
//
//    @Before("allMethod()")
//    void beforeSecurityCheckAdvice() {
//        System.out.println("beforeSecurityCheckAdvice");
//    }
}
