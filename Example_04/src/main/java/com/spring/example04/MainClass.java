package com.spring.example04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student01 = ctx.getBean("student01", Student.class);
		System.out.println("이름 : " + student01.getName());
		System.out.println("나이 : " + student01.getAge());
		System.out.println("취미 : " + student01.getHobbys());
		System.out.println("신장 : " + student01.getHeight());
		System.out.println("몸무게 : " + student01.getWeight());
		
		Student student02 = ctx.getBean("student02",Student.class);
		System.out.println("이름 : " + student02.getName());
		System.out.println("나이 : " + student02.getAge());
		System.out.println("취미 : " + student02.getHobbys());
		System.out.println("신장 : " + student02.getHeight());
		System.out.println("몸무게 : " + student02.getWeight());
		
		ctx.close();
	}
}
