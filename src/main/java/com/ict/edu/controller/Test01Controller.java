package com.ict.edu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.edu.service.Test01Service;

@Controller
public class Test01Controller {
	
	// 변수이름과 참조하는 클래스의 id 가 같을 때 : @Autowired 만
	@Autowired
	private Test01Service test01Service;
	
	@GetMapping("hello.do")
	public ModelAndView helloCommand(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("test01/result");
		
		// Test01Service service = new Test01Service();
		String msg = test01Service.getGreeting();
		mv.addObject("msg", msg);
		
		return mv;
	}
}
