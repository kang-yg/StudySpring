package com.spring.example12;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Plese input \"dev\" or \"run\" : ");
		String str = scanner.next();
		
		if (str.equals("dev")) {
			config = "dev";
		} else if (str.equals("run")) {
			config = "run";
		}
		scanner.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ApplicationCTX_dev.class, ApplicationCTX_run.class);
		ctx.refresh();
		
		ServerInfo info = ctx.getBean("info", ServerInfo.class);
		System.out.println("getIpNum : " + info.getIpNum());
		System.out.println("getPortNum : " + info.getPortNum());
	}

}
