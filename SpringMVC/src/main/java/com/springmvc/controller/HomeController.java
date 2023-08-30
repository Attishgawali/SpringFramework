package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) 
	{
		System.out.println("This is home url");
		model.addAttribute("name","Tejas Gawali");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		
		//adding model 
		modelAndView.addObject("name","Attish");
		modelAndView.addObject("rollno",5465);
		
		//adding view
		modelAndView.setViewName("help");
		
		//marks
		List<Integer> marks= new ArrayList<Integer>();
		marks.add(13);
		marks.add(12);
		marks.add(14);
		marks.add(15);
		marks.add(16);
		
		modelAndView.addObject("marks",marks);
		return modelAndView;
	}
}
