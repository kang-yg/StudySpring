package com.spring.example15;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/classRequestMapping")
public class SampleRequestMapping {

	@RequestMapping("/view03")
	public String view03() {

		return "classRequestMapping/view03";
	}

}
