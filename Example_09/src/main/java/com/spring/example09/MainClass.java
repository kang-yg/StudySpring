package com.spring.example09;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String str = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(str);
		
		AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("adminID : " + adminConnection.getAdminID());
		System.out.println("adminPW : " + adminConnection.getAdminPW());
		System.out.println("sub_adminID : " + adminConnection.getSub_adminID());
		System.out.println("sub_adminPW : " + adminConnection.getSub_adminPW());
		
		ctx.close();
	}

}
