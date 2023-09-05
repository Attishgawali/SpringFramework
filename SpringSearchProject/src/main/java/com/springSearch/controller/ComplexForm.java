package com.springSearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springSearch.entities.Student;

@Controller
public class ComplexForm {
	
	@RequestMapping("/complex")
	public String showform() {
		
		return "complexForm";
	}
	
	@RequestMapping("/handleform")
	public String handleform(@ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "complexForm";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
}
