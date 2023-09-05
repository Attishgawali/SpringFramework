package com.productcrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.productcrud.model.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/addProduct")
	public String showProductForm(Model m) {
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}

	@RequestMapping("/handle-form")
	public RedirectView handleForm(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
