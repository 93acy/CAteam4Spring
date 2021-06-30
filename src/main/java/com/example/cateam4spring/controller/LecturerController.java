package com.example.cateam4spring.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.service.EnrolmentService;



@Controller
@RequestMapping("/lecturer")
public class LecturerController {
	
	
	@Autowired
	private EnrolmentService es;
	
	@Autowired
	CourseRepository crepo;
	
	@Autowired
	EnrolmentRepository erepo;
	

	
	@GetMapping("/home")
	public String returnHome() {					
		
		return "lecturer_home";	
	}
	
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
	public String showGrades(Enrolment enrolment, Model model) {
		model.addAttribute("glist", erepo.findAll());
		return "grade_list";
	}
	
//	@GetMapping("/edit/{id}")
//	public ModelAndView editGrade(@PathVariable("id") Integer id) {
//		ModelAndView mav = new ModelAndView("grade_edit");
//		List<Enrolment> enrolment = es.findEnrolmentsByStudentId(id);
//		mav.addObject("enrolment", enrolment);
//		return mav;
//	}
//
//	@PostMapping(value = "/edit/{id}")
//	public ModelAndView editGrade(@ModelAttribute @Valid Enrolment enrolment, BindingResult result,
//			@PathVariable Integer id) {
//
//		if (result.hasErrors())
//			return new ModelAndView("grade_edit");
//
//		es.updateEnrolment(enrolment);
//		ModelAndView mav = new ModelAndView("forward:/lecturer/grade");
//		return mav;
//	}
//	
	@GetMapping("/edit/{id}")
	public ModelAndView editGrade(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("grade_edit");
		Optional<Enrolment> enrolment = es.findEnrolmentById(id);
		mav.addObject("enrolment", enrolment);
		return mav;
	}

	@PostMapping(value = "/edit/{id}")
	public ModelAndView editGrade(@ModelAttribute @Valid Enrolment enrolment, BindingResult result,
			@PathVariable Integer id) {

		if (result.hasErrors())
			return new ModelAndView("grade_edit");

		es.updateEnrolment(enrolment);
		ModelAndView mav = new ModelAndView("forward:/lecturer/grade");
		return mav;
	}
	
	
	@RequestMapping("/logout")
	public String logout() {

		return "index";
	}


}
