package com.spring.example13;

public class Worker {
	private String company;
	private String position;

	public void getInfo() {
		System.out.println("company : " + this.getCompany());
		System.out.println("position : " + this.getPosition());
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
