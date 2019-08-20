package com.frontend.web.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorPage implements ErrorController
{

	@RequestMapping("/error")
	public ModelAndView error()
	{
		ModelAndView mv = new ModelAndView("Error");
		mv.addObject("title","error");
		return mv;
	}
	
	@Override
	public String getErrorPath()
	{
		return "error";
	}

}
