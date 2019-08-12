package com.spring.example13;

public class Student {
	private String name;

	
	public void getInfo() {
		System.out.println("name : " + this.getName());

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

}
