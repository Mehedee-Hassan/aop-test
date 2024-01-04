package com.test.aop.demoaop.aop.inf;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
//This specifies where your custom annotation can be applied.
@Retention(RetentionPolicy.RUNTIME)
public @interface TestMeAround {
}
