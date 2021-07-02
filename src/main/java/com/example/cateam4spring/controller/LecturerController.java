package com.example.cateam4spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.cateam4spring.exception.InvalidGradeException;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.service.CourseService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;

@Controller
@RequestMapping("/lecturer")
public class LecturerController {
	
	
	@Autowired
	private EnrolmentService es;
	
	@Autowired
	private CourseService cs;
	
	@Autowired
	private StudentService ss;
	
	@Autowired
	CourseRepository crepo;
	
	@Autowired
	EnrolmentRepository erepo;

	
	@GetMapping("/home")
	public String returnHome() {					
		
		return "lecturer_home";	
	}
	
	@RequestMapping("/course")
	public String listCourse(Model model, String keyword) {
		
		if(keyword !=null) {
			model.addAttribute("courses", cs.findByKeyword(keyword));
		}		
		else {
			model.addAttribute("courses", crepo.findAll());	
		}
		return "course";	
	}
	
	
	@GetMapping("/enrolment")
	public String listEnrolment(Model model, String keyword) {
		
		if(keyword !=null) {
			model.addAttribute("enrolments", es.findByKeyword(keyword));
		}		
		else {
			model.addAttribute("enrolments", erepo.findAll());	
		}
		return "enrolment";
		
		
	}
	
	@GetMapping("/performance")
	public String listPerformance(Model model) {
		model.addAttribute("performances", erepo.findAll());
		return "student_performance";
	}
	
	@RequestMapping("/grade")
	public String showGrades(Model model) {
		model.addAttribute("enrolment", erepo.findAll());
		return "grade_list";
	}
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editGrade(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("grade_edit");
		Enrolment enrolment = es.findEnrolmentById(id);
		mav.addObject("enrolment", enrolment);
		return mav;
		}


	@RequestMapping(value = "/save/{id}")
	public ModelAndView saveGrade(@RequestParam Double grade, @PathVariable("id") Integer id) {

		try {
			Enrolment enrolment = es.findEnrolmentById(id);
			enrolment.setGrade(grade);
			
			if (grade <0 || grade>100) {
				throw new InvalidGradeException("Grade should be within 0 to 100 :)");
			}
			
			enrolment.setCourseStatus();
			es.updateGrade(grade, id);
			es.updateCourseStatus();
			Double gpa = ss.calculateGPA(enrolment.getStudent().getId());
			ModelAndView mav = new ModelAndView("forward:/lecturer/grade");
			return mav;
		}
		
		catch (InvalidGradeException e){
			ModelAndView mav = new ModelAndView("redirect:/lecturer/edit/{id}");
			mav.addObject("errMsg", e.getMessage());
			return mav;
		}
		
	}
	

	
	@RequestMapping("/logout")
	public String logout() {

		return "index";
	}


}
