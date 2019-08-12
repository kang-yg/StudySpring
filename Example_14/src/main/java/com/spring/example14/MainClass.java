package com.spring.example14;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student = ctx.getBean("student01", Student.class);
		
		student.printInfo();
		
		ctx.close();
	}

}
