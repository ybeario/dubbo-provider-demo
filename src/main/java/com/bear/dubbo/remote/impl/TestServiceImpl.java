package com.bear.dubbo.remote.impl;

import com.bear.dubbo.remote.TestService;

public class TestServiceImpl implements TestService {  
    @Override  
    public String sayHello(String name) {  
        return "Hello " + name + "!";  
    }  
}  