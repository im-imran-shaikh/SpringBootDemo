package com.frontend.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	@RequestMapping({"/home","/"})
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("Message", "Welcome, to spring boot application");
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1")int t1, @RequestParam("t2")int t2)
	{
		ModelAndView mv = new ModelAndView("Total");
		mv.addObject("Total",t1+t2);
		return mv;
	}
	
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "About me");
		mv.addObject("About", "Developed by me!!");
		mv.setViewName("About");
		return mv;
	}

}
