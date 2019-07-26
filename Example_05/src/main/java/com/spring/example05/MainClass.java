package com.spring.example05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationCTX.class);
		Student student = ctx.getBean("student01",Student.class);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		student = ctx.getBean("student02", Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		ctx.close();
	}
}
