package com.spring.example13;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student = ctx.getBean("student01",Student.class);
		
		student.getInfo();
		
		Worker worker = ctx.getBean("worker01", Worker.class);
		worker.getInfo();
		
		ctx.close();
	}

}
