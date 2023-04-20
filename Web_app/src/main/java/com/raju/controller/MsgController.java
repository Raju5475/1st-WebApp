package com.raju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
	  ModelAndView mv=new ModelAndView();
	  mv.addObject("msg", "Welcome to 1st web app With mini project.....");
	  mv.setViewName("message");
	  return mv;
	}
	@GetMapping("/greet")
	public ModelAndView Msg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Hey Raju Welcome to WEB__MVC Raju...!");
		mv.setViewName("message");
		return mv;
	}

}
