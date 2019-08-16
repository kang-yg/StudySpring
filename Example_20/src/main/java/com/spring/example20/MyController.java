package com.spring.example20;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/createPage")
	public String studentForm() {

		return "createPage";
	}

	@RequestMapping("/createDonePage")
	public String studentCreate(@ModelAttribute("student") Student student, BindingResult result) {

		String page = "createDonePage";

		StudentValidator studentValidator = new StudentValidator();
		studentValidator.validate(student, result);

		if (result.hasErrors()) {
			page = "createPage";
		}

		return page;
	}

}
