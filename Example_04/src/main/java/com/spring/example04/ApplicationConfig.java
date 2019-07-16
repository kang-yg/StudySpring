package com.spring.example04;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationConfig {

	@Bean
	public Student student01() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("�丮");
		
		Student student = new Student("������", 25, hobbys);
		student.setHeight(167);
		student.setWeight(60);
		
		return student;
	}
	
	@Bean
	public Student student02() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("���ǰ���");
		
		Student student = new Student("�̳�", 23, hobbys);
		student.setHeight(163);
		student.setWeight(45);
		
		return student;
	}
}

