package com.example.cateam4spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Role;
import com.example.cateam4spring.service.CourseService;

@Controller
@RequestMapping(value="/admin_course")
public class AdminCourseController {
	
	@Autowired
	CourseService cservice;
	
	@RequestMapping("/new")
	public String showNewCoursePage(Model model) {
		Course course = new Course();
		model.addAttribute("course", course);
		return "Admin/new_course";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCourse(@ModelAttribute("course") Course course) {
		cservice.saveCourse(course);
	    return "redirect:/admin_home/course";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCoursePage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("Admin/edit_course");
	    Course course = cservice.findCourse(id);
	    mav.addObject("course", course);
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCourse1(@PathVariable(name = "id") int id) {
	    cservice.delete(id);
	    return "redirect:/admin_home/course";       
	}
}
