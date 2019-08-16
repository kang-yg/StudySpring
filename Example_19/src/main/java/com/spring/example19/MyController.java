package com.spring.example19;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/studentConfirm")
	public String login(HttpServletRequest httpServletRequest, Model model) {

		String id = httpServletRequest.getParameter("id");

		if (id.equals("abc")) {
			return "redirect:studentOk";
		}

		return "redirect:studentNg";

	}

	@RequestMapping("/studentOk")
	public String studentOk() {
		
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg() {
		
		return "student/studentNg";
	}
}