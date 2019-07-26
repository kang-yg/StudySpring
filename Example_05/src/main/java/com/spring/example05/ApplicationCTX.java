package com.spring.example05;

import org.springframework.context.annotation.Bean;

public class ApplicationCTX {
	
	@Bean
	public Student student01(){
		Student student = new Student("강영규", 25);
		
		return student;
	}
	
	@Bean
	public Student student02(){
		Student student = new Student("미나", 23);
		
		return student;
	}

}
