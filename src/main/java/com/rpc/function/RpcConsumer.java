package com.rpc.function;


public class RpcConsumer {
public static void main(String[] args) throws Exception {
	HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 9000);
	String resultString =  service.hello("yingzi");
	System.out.println(resultString);
}
}
