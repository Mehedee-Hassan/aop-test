package com.test.aop.demoaop.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import com.test.aop.demoaop.aop.inf.TestMeAround;
@Aspect
@Component
public class TestAopAround {
    @Around("@annotation(com.test.aop.demoaop.aop.inf.TestMeAround)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
        // if we don't proceed with the function call
        // this will stop execution at the middle..
    }
}
/*
* don't call proceed() on the ProceedingJoinPoint object,
* the execution of the method that is being advised will not continue. Essentially,
* you're halting the execution of the method at the point of advice.
* */
