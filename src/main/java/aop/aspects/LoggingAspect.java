package aop.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* get*())")
    private void anyGetMethods(){}

    @Before("anyGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
    }

    // * означает - любое
    @Before("execution(public * aop.Library.returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка отдать книгу");
    }

    @Before("execution(public * aop.Library.add*(..))")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Сигнатура метода: " + methodSignature + "\nНазвание метода: " + methodSignature.getName());
        System.out.println("beforeGetBookAdvice: попытка добавить книгу");
    }
}
