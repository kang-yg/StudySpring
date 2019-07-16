package com.spring.example04;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationConfig {

	@Bean
	public Student student01() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("강영규", 25, hobbys);
		student.setHeight(167);
		student.setWeight(60);
		
		return student;
	}
	
	@Bean
	public Student student02() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("음악감삼");
		
		Student student = new Student("미나", 23, hobbys);
		student.setHeight(163);
		student.setWeight(45);
		
		return student;
	}
}

