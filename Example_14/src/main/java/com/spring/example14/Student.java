package com.spring.example14;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("printInfo()");
		System.out.println(this.getName());
	}
}
