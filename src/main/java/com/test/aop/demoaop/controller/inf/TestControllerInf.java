package com.test.aop.demoaop.controller.inf;

import org.springframework.context.annotation.Description;

public interface TestControllerInf {
    @Description("test the reply from server")
    public String testReply();
}
