package com.mybatisFrame.functionDatabase;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainApp {
public static void main(String[] args) throws IOException {
	String resource = "mybatis-config.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession session = sqlSessionFactory.openSession();
	try {
		Student student = session.selectOne("getOne", "2");
		System.out.println(student.toString());
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		session.close();
	}
}
}
