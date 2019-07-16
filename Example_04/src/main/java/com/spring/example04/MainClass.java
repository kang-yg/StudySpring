package com.spring.example04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student01 = ctx.getBean("student01", Student.class);
		System.out.println("�̸� : " + student01.getName());
		System.out.println("���� : " + student01.getAge());
		System.out.println("��� : " + student01.getHobbys());
		System.out.println("���� : " + student01.getHeight());
		System.out.println("������ : " + student01.getWeight());
		
		Student student02 = ctx.getBean("student02",Student.class);
		System.out.println("�̸� : " + student02.getName());
		System.out.println("���� : " + student02.getAge());
		System.out.println("��� : " + student02.getHobbys());
		System.out.println("���� : " + student02.getHeight());
		System.out.println("������ : " + student02.getWeight());
		
		ctx.close();
	}
}
