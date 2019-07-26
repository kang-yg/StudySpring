package com.spring.example10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ApplicationCTX {
	@Value("${admin.id}")
	private String adminID;
	@Value("${admin.pw}")
	private String adminPW;
	@Value("${sub_admin.id}")
	private String sub_adminID;
	@Value("${sub_admin.pw}")
	private String sub_adminPW;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] resources = new Resource[2];
		resources[0] = new ClassPathResource("admin.properties");
		resources[1] = new ClassPathResource("sub_admin.properties");
		configurer.setLocations(resources);
		
		return configurer;
	}
	
	@Bean
	public AdminConnection adminConfig() {
		AdminConnection adminConnection = new AdminConnection();
		adminConnection.setAdminID(adminID);
		adminConnection.setAdminPW(adminPW);
		adminConnection.setSub_adminID(sub_adminID);
		adminConnection.setSub_adminPW(sub_adminPW);
		
		return adminConnection;
	}
	
}
