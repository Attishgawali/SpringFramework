package com.springSearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchApp {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName) {
		System.out.println(userName);
		System.out.println(userId);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("home calling ...");
		return "home";
	}
	
	
	@RequestMapping("/processForm")
	public RedirectView search(@RequestParam("query") String query) {
		System.out.println("searching ...");
		RedirectView r = new RedirectView();
		r.setUrl("https://www.google.com/search?q="+query);
		return r;
	}
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("welcome page called ...");
		String str=null;
		str.length();
		return "welcome";
	}
	
	
	@RequestMapping("/handler")
	public String handler() {
		System.out.println("handler is called ...");
		return "welcome";
	}
	
//	
//	//Handling exception Handling
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg","Null Pointer Exception Occured");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model m) {
//		m.addAttribute("msg","Null Pointer Exception Occured");
//		return "null_page";
//	}
//
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGeneric() {
//		return "null_page";
//	}
}
