package com.spring.example12;

import org.omg.CORBA.OMGVMCID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("dev")
public class ApplicationCTX_dev {
	
	@Bean
	public ServerInfo info() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("localhost");
		info.setPortNum("8181");
		
		return info;
	}
}
