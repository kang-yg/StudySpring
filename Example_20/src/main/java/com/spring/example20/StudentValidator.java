package com.spring.example20;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		// 검증할 객체의 클래스 타입 정보
		return Student.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		System.out.println("validate()");
		Student student = (Student) target;

		String studentName = student.getName();
		if (studentName == null || studentName.trim().isEmpty()) {
			System.out.println("studnt is null or empty");
			errors.rejectValue("name", "trouble");
		}

		int studentId = student.getId();
		if (studentId == 0) {
			System.out.println("studntId is 0");
			errors.rejectValue("id", "trouble");
		}
	}

}
