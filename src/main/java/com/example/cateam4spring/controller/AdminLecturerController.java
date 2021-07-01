package com.example.cateam4spring.controller;

import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.service.AdminLecturerService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/admin_lecturer")
public class AdminLecturerController {
	
	@Autowired
	private AdminLecturerService alservice;
	
	@RequestMapping("/new")
	public String showNewLecturerPage(Model model) {
	    Lecturer lecturer = new Lecturer();
	    model.addAttribute("lecturer", lecturer);
	    return "Admin/new_lecturer";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLecturer(@ModelAttribute("lecturer") Lecturer lecturer) {
	    alservice.save(lecturer);
	     
	    return "redirect:/admin_home/lecturer";
	}

}


