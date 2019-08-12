package com.spring.example15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/view02")
	public String view02() {
		
		return "view02";
	}
	
	@RequestMapping("/conent/contentView")
	public String content(Model model) {
		model.addAttribute("id", "abcde");
		
		return "content/contentView";
	}
	
	@RequestMapping("/model/modelEx")
	public ModelAndView modelEx() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "aaaa");
		mv.setViewName("model/modelEx");
		
		return mv;
	}

}
