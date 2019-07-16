package com.spring.example03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String str = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(str);
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		
		pencil.use();
		
		ctx.close();
	}
}
