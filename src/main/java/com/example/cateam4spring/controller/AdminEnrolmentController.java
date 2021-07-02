package com.example.cateam4spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.service.AdminEnrolmentLecturerCourseService;
import com.example.cateam4spring.service.CourseService;

@Controller
@RequestMapping(value="/admin_enrolment")
public class AdminEnrolmentController {
	
	@Autowired
	private AdminEnrolmentLecturerCourseService aelcservice;
	
	@Autowired
	private CourseService cservice;
	
	@RequestMapping("/edit_lecturersincourse/{cid}")
	public String returnAllLecturers(@PathVariable(name="cid") Integer cid, Model model) {
		Course course = cservice.findCourse(cid);
		List<Lecturer> listLecturersInCourse = aelcservice.findLecturersInCourse(cid);
		List<Lecturer> listLecturersNotInCourse = aelcservice.findLecturersNotInCourse(cid);
		model.addAttribute("course", course);
		model.addAttribute("listLecturersInCourse", listLecturersInCourse);
		model.addAttribute("listLecturersNotInCourse", listLecturersNotInCourse);
		return "Admin/admin_enrolment_editlecturers";
	}
	
	@RequestMapping("/remove/{cid}/{lid}")
	public String removeLecturerFromCourse(@PathVariable(name="cid") Integer cid,
			@PathVariable(name="lid") Integer lid) {
		aelcservice.deleteLecturerInCourse(cid, lid);
		return "redirect:/admin_enrolment/edit_lecturersincourse/{cid}";
	}
	
	@RequestMapping("/add/{cid}/{lid}")
	public String AddLecturerToCourse(@PathVariable(name="cid") Integer cid,
			@PathVariable(name="lid") Integer lid) {
		aelcservice.addLecturerToCourse(lid, cid);
		return "redirect:/admin_enrolment/edit_lecturersincourse/{cid}";
	}
}
