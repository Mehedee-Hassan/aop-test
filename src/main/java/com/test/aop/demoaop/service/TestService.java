package com.test.aop.demoaop.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String testReply(){
        return "Test from service.";
    }

}
