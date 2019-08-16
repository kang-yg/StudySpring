package com.spring.example17;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/index")
	public String index() {
		
		return "/index";
	}

	@RequestMapping(method = RequestMethod.GET, value="/studentId")
	public String goStudentGet(HttpServletRequest httpServletRequest, Model model) {
		
		System.out.println("RequestMethod.GET");
		
		String id = httpServletRequest.getParameter("id");
		System.out.println("id : " + id);
		model.addAttribute("studentId", id);
		
		return "student/studentId";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/studentPw")
	public String goStudentPost(HttpServletRequest httpServletRequest, Model model) {
		
		System.out.println("RequestMethod.POST");
		
		String pw = httpServletRequest.getParameter("pw");
		System.out.println("pw : " + pw);
		model.addAttribute("studentPw", pw);
		
		return "student/studentPw";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/studentId")
	public ModelAndView goStudentGet(HttpServletRequest httpServletRequest) {
		
		System.out.println("RequestMethod.POST");
		ModelAndView mv = new ModelAndView();
		
		String id = httpServletRequest.getParameter("id");
		System.out.println("id : " + id);
		
		mv.addObject("studentId", id);
		mv.setViewName("student/studentId");
		
		return mv;
	}
}
