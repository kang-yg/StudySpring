package com.spring.example16;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/board/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "board/confirmId";
	}

	@RequestMapping("/member/memberView")
	public ModelAndView memberView(HttpServletRequest httpServletRequest, Model model) {
		ModelAndView mv = new ModelAndView();
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		mv.addObject("id", id);
		mv.addObject("pw", pw);
		mv.setViewName("member/memberView");

		return mv;
	}

	@RequestMapping("/board/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "board/checkId";
	}

	@RequestMapping("/member/join")
	public String join(@RequestParam("name") String name, @RequestParam("id") String id, @RequestParam("pw") String pw,
			@RequestParam("email") String email, Model model) {

		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setEmail(email);

		model.addAttribute("memberInfo", member);

		return "member/join";
	}

	@RequestMapping("/member/info")
	public String info(Member member) {
		
		
		return "member/info";
	}
	
	@RequestMapping("/member/pathVariable/{studentId}")
	public String pathVariable(@PathVariable String studentId, Model model) {
		model.addAttribute("StudentId", studentId);
		
		return "member/pathVariable";
	}
}
