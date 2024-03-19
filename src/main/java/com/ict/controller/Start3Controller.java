package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Start3Controller {
	
	// 요청이 오면 실행해야 된다.
	/*
	@RequestMapping(value = "start3.do", method = RequestMethod.GET)
	@RequestMapping(value = "start3.do", method = RequestMethod.post)
	@RequestMapping("start3.do")
	
	@GetMapping("start3.do")
	@PostMapping("start3.do")
	*/
	
	@GetMapping("/start3.do")	// a링크는 get
	public ModelAndView exec(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("result3");
		mv.addObject("city", "서울");
		return mv;
	}
}
