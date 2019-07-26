package com.spring.example09;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AdminConnection implements InitializingBean, DisposableBean {
	private String adminID;
	private String adminPW;
	private String sub_adminID;
	private String sub_adminPW;

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}	
	
	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getAdminPW() {
		return adminPW;
	}

	public void setAdminPW(String adminPW) {
		this.adminPW = adminPW;
	}

	public String getSub_adminID() {
		return sub_adminID;
	}

	public void setSub_adminID(String sub_adminID) {
		this.sub_adminID = sub_adminID;
	}

	public String getSub_adminPW() {
		return sub_adminPW;
	}

	public void setSub_adminPW(String sub_adminPW) {
		this.sub_adminPW = sub_adminPW;
	}
}
