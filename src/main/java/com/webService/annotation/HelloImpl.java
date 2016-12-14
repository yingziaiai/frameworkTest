package com.webService.annotation;

import javax.jws.WebService;

@WebService(endpointInterface = "com.webService.annotation.IHello")  
public class HelloImpl implements IHello {  
  

    public String sayHello(String name) {  
        return "Hello JAX-WS. Welcome, "+name;  
    }  
}  
