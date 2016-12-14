package com.webService.annotation;
//http://blog.csdn.net/zgmzyr/article/details/8674533
import javax.xml.ws.Endpoint;
//http://127.0.0.1:9999/ws/hello?wsdl
public class HelloPublisher {  
    public static void main(String[] args) {  
        Endpoint.publish("http://127.0.0.1:9999/ws/hello", new HelloImpl());  
        System.out.println("published.");  
    }  
} 
