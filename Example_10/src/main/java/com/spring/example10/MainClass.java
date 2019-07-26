package com.spring.example10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ApplicationCTX.class);
		AdminConnection adminConnection = annotationConfigApplicationContext.getBean("adminConfig", AdminConnection.class);
		
		System.out.println("getAdminID : " + adminConnection.getAdminID());
		System.out.println("getAdminPW : " + adminConnection.getAdminPW());
		System.out.println("getSub_adminID : " + adminConnection.getSub_adminID());
		System.out.println("getSub_adminPW : " + adminConnection.getSub_adminPW());
		
		annotationConfigApplicationContext.close();
	}
}
