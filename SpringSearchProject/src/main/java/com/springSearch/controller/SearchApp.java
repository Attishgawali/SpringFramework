package com.springSearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchApp {

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
}
