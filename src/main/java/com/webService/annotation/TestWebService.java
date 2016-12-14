package com.webService.annotation;
//http://blog.csdn.net/z69183787/article/details/39228005?locationNum=3
//very good
//http://www.micmiu.com/soa/webservice/jax-ws-demo/
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestWebService {
	public static void main(String[] args) throws Exception {  
        //1: argument service URI, refer to wsdl document above  
        //2: argument is service name, refer to wsdl document above  
  
        URL url = new URL("http://127.0.0.1:9999/ws/hello?wsdl");  
        QName qname = new QName("http://annotation.webService.com/", "HelloImplService");  
        Service service = Service.create(url, qname);  
        IHello hello = service.getPort(IHello.class);  
   
        System.out.println(hello.sayHello("Leon Su"));  
    }  
}
