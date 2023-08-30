package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entities.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	//adding common or repeatively use data using @ModelAttribute at top of method
	@ModelAttribute
	public void addingCommonData(Model model) {
		model.addAttribute("title","Learn code with Attish");
		model.addAttribute("desc","We are learing Spring");
		System.out.println("Adding common data ...");
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	
	//accepting data from view to controller and process and send data from controller to view All using @ModelAttribute
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String formProcess(@ModelAttribute User user,Model model) {
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}
	
	
	
/*	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String formProcess(
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPass,
			@RequestParam("name") String userName,
			Model model) {
		

		//using old HttpServletRequest
//		String name = request.getParameter("name");
//		System.out.println("User name is " +name);
		
		
		//using new @ReqeustParam
//		System.out.println("user email " + userEmail);
//		System.out.println("user password " + userPass);
//		System.out.println("user name " + userName);
//		
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",userPass);
//		model.addAttribute("name",userName);
		
		
		
		User user = new User();
		user.setEmail(userEmail);
		user.setPassword(userPass);
		user.setName(userName);
		
		System.out.println(user);
		model.addAttribute(user);
		
		return "success";
	}
	
	*/
	

	
	
	

}
