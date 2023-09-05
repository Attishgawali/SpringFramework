package com.springSearch.controller;

import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		return "fileform";
	}
	
	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	public String uploadImage(@RequestParam("profile") CommonsMultipartFile file,HttpSession s, Model m) {
		System.out.println("file uploaded ...");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
		
		//save data to server
		String path = s.getServletContext().getRealPath("/")+"WEB-INF/resources/images/"+file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			m.addAttribute("msg","uploaded successfully");
			m.addAttribute("filename",file.getOriginalFilename());
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occured during uploading file");
			m.addAttribute("msg","Uploading error!!");
		}
		
		return "fileSuccess";
	}

}
