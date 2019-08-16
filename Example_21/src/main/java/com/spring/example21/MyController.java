package com.spring.example21;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/student/createPage")
	public String studentForm() {

		return "student/createPage";
	}

	@RequestMapping("/student/createDonePage")
	public String studentCreat(@ModelAttribute("student") @Validated Student student, BindingResult bindingResult) {

		String page = "createDonePage";

		if (bindingResult.hasErrors()) {
			page = "student/createPage";
		}

		return "student/createPage";
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}

}
