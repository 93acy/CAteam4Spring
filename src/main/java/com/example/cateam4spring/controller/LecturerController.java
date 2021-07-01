package com.example.cateam4spring.controller;





import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.service.CourseService;
import com.example.cateam4spring.service.EnrolmentService;



@Controller
@RequestMapping("/lecturer")
public class LecturerController {
	
	
	@Autowired
	private EnrolmentService es;
	
	@Autowired
	private CourseService cs;
	
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
	public String showGrades(Model model) {
		model.addAttribute("enrolment", erepo.findAll());
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
//	@GetMapping("/edit/{id}")
//	public ModelAndView editGrade(@PathVariable("id") Integer id) {
//		ModelAndView mav = new ModelAndView("grade_edit");
//		Optional<Enrolment> enrolment = es.findEnrolmentById(id);
//		
//		enrolment.ifPresent(o -> mav.addObject("enrolment", enrolment.get()));
//		
//		return mav;
//	}

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
	
	@RequestMapping("/edit/{id}")
	  public String editGrade(Model model, @PathVariable("id") Integer id) {
		model.addAttribute("enrolment", es.findEnrolmentById(id).get());
		return "grade_edit";
	  }
	
	
	@RequestMapping("/save")
	public String saveGrade(@ModelAttribute("enrolment") Enrolment enrolment) {
	    
		Double grade= enrolment.getGrade();
		Integer id = enrolment.getId();
		
		es.updateGrade(grade,id);
	     
	    return "forward:/lecturer/grade";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {

		return "index";
	}


}
