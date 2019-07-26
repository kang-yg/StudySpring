package com.spring.example06;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod");
	}
	
}
