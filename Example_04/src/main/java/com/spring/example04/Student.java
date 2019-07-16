package com.spring.example04;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double height;
	private double weight;
	
	public Student(String name, int age, ArrayList<String> hobbys) {
		super();
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
}
