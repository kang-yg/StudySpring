package com.spring.example02;

public class Person {
	private String name;
	private int age;
	Student student;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(student.getStudentNum());
	}
}
