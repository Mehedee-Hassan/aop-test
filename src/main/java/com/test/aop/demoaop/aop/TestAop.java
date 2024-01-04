package com.test.aop.demoaop.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAop {

    @Before("@annotation(com.test.aop.demoaop.aop.inf.TestMe)")
    public void beforeController(){
        System.out.print("### Before test");
    }

}
