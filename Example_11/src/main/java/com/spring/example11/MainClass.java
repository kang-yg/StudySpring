package com.spring.example11;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

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

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");

		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("getIpNum : " + info.getIpNum());
		System.out.println("getPortNum : " + info.getPortNum());
	}
}
