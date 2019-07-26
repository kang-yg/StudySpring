package com.spring.example12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("run")
public class ApplicationCTX_run {
	
	@Bean
	public ServerInfo info() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("213.186.229.29");
		info.setPortNum("80");
		
		return info;
	}

}
