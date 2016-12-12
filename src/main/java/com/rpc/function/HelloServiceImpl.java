package com.rpc.function;

public class HelloServiceImpl implements HelloService{

	public String hello() {
		return "Hello";
	}

	public String hello(String name) {
		return name;
	}

}
