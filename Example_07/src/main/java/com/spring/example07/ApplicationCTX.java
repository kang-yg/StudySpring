package com.spring.example07;

import org.springframework.context.annotation.Bean;

public class ApplicationCTX {
	
	@Bean
	public Student student01() {
		Student student = new Student("������", 25);
		
		return student;
	}

}
