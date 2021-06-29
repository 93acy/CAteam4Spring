package com.example.cateam4spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;



@Controller
@RequestMapping("/lecturer")
public class LecturerController {
	
	@Autowired
	CourseRepository crepo;
	
	@Autowired
	EnrolmentRepository erepo;
	

	
	@GetMapping("/course")
	public String listCourse(Model model) {				
		model.addAttribute("courses", crepo.findAll());		
		return "course";	
	}
	
	
	@GetMapping("/enrolment")
	public String listEnrolment(Model model) {
		model.addAttribute("enrolments", erepo.findAll());
		return "enrolment";
	}
	
	@GetMapping("/performance")
	public String listPerformance(Model model) {
		model.addAttribute("performances", erepo.findAll());
		return "student_performance";
	}
	
	@RequestMapping("/grade")
	public String editGrades(Model model) {
		model.addAttribute("glist", erepo.findAll());
		return "grading";
	}


}
