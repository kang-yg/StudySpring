package com.spring.example07;

import org.springframework.context.annotation.Bean;

public class ApplicationCTX {
	
	@Bean
	public Student student01() {
		Student student = new Student("°­¿µ±Ô", 25);
		
		return student;
	}

}
