package com.test.aop.demoaop.controller;

import com.test.aop.demoaop.aop.inf.TestMe;
import com.test.aop.demoaop.aop.inf.TestMeAround;
import com.test.aop.demoaop.controller.inf.TestControllerInf;
import com.test.aop.demoaop.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestControllerInf {

    private final TestService testService;
    public TestController(TestService testService){
        this.testService = testService;
    }


    @Override
    @TestMe
    @TestMeAround
    @GetMapping("/v1/test")
    public String testReply(){
        String response =  "This is a test reply from Controller."
                + testService.testReply();
        return  response;
    }
}
