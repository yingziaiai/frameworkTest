package com.mybatisFrame.functionDatabase;
//http://blog.csdn.net/wanda39kela/article/details/6103282
//http://www.mybatis.org/mybatis-3/getting-started.html
public class Student {
	private Integer age;
	private String name;
	private Integer id;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	public String toString(){
		return "id:"+ id + "name:"+ name + "age:"+ age;
	}

}
