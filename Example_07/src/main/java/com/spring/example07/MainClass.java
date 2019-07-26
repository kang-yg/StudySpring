package com.spring.example07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationCTX.class);
		Student student = ctx.getBean("student01",Student.class);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		System.out.println("----------------------");
		
		Student student2 = ctx.getBean("student01",Student.class);
		student.setAge(23);
		student.setName("¹Ì³ª");
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		System.out.println("======================");
		
		if(student == student2) {
			System.out.println("student == student2");
		}
		else {
			System.out.println("student != student2");
		}
	}

}
