package com.example.cateam4spring.controller;

import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.service.AdminLecturerService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin_lecturer")
public class AdminLecturerController {
	
	@Autowired
	private AdminLecturerService alservice;
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Lecturer lecturer = new Lecturer();
	    model.addAttribute("lecturer", lecturer);
	     
	    return "new_product";
	}

}


