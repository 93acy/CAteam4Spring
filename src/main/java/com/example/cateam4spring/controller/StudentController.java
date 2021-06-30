package com.example.cateam4spring.controller;

//import java.security.Principal;
import java.util.List;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
//import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.service.CourseService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.MyUserDetails;
//import com.example.cateam4spring.service.StudentService;
import com.example.cateam4spring.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@Autowired
	private CourseService cs;
	
	@Autowired
	private EnrolmentService es;
	 
	/*@RequestMapping("/home")
	public String ShowHomePage() {
		
		return "Home";
	}*/
	
	/*@RequestMapping("/login/student")
	public String StudentLogin(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		return "StudentLogin";
	}*/
	
	/*@RequestMapping("/login/authenticate")
	public String Authenticate(@ModelAttribute("student") Student student, Model model, HttpSession session) {
		
		if(ss.Authenticate(student)) {
			Student s = ss.findStudentById(student.getId());
			session.setAttribute("studentSession", s);
			return "Dashboard";	
		}
			
		else 
			return "StudentLogin";
		
	}*/
	
	@RequestMapping("/student/gradeandgpa")
	public String ViewGradeAndGpa(Model model, @AuthenticationPrincipal MyUserDetails userDetails) {
		
		List<Enrolment> enrollments = es.findEnrollmentById(userDetails.getId());
		model.addAttribute("enrollments", enrollments);
		Integer GPA = ss.findGpaById(userDetails.getId());
		model.addAttribute("GPA", GPA);
		
		return "GradeAndGPA";
	}
	/*
	@RequestMapping("/student/gradeandgpa")
	public String ViewGradeAndGpa(Model model, @SessionAttribute("studentSession") Student s) { 
		
		List<Enrolment> enrollments = es.findEnrollmentById(s.getId());
		model.addAttribute("enrollments", enrollments);
		
		return "GradeAndGPA";
	}*/
	
	@RequestMapping("/student/viewcourse")
	public String ViewCourse(Model model, @AuthenticationPrincipal MyUserDetails userDetails) {
		
		List<Course> allCourses = cs.findAll();
		model.addAttribute("allCourses", allCourses);
		
		return "ViewCourse";
		
	}
	
	/*@RequestMapping("/student/viewcourse")
	public String ViewCourse(Model model, @SessionAttribute("studentSession") Student s) {
		
		List<Course> allCourses = cs.findAll();
		model.addAttribute("allCourses", allCourses);
		
		return "ViewCourse";
		
	}*/
	
	@RequestMapping("/student/student_home")
	public String dashBoard(@AuthenticationPrincipal MyUserDetails userDetails) {
		
		return "student_home";
		
	}
	
	
	/*@RequestMapping("/student/student_home")
	public String dashBoard(@SessionAttribute("studentSession") Student s) {
		
		return "student_home";
		
	}*/
	
	@RequestMapping("/student/enrollcourse")
	public String ShowEnrollCoursePage(Model model, @AuthenticationPrincipal MyUserDetails userDetails) {
		
		List<Course> unattendedCourses = es.findCourseNotEnroll(userDetails.getId());
		model.addAttribute("unattendedCourses", unattendedCourses);
			
		return "EnrollCourse";
	}
	
	/*@RequestMapping("/student/enrollcourse")
	public String ShowEnrollCoursePage(Model model, @SessionAttribute("studentSession") Student s) {
		
		List<Course> unattendedCourses = es.findCourseNotEnroll(s.getId());
		model.addAttribute("unattendedCourses", unattendedCourses);
			
		return "EnrollCourse";
	}*/
	
	@RequestMapping("/student/enrollcourse/{id}")
	public String EnrollCourse(@PathVariable("id") Integer id, Model model, @AuthenticationPrincipal MyUserDetails userDetails) {
		
		Double capacity =  cs.findCapacityById(id);
		Double currentSelectNum = cs.findcurrentSelectNumById(id);
		if(cs.Compare(capacity,currentSelectNum)==true) {
			es.enrollCourse(userDetails.getId(), id);
			Integer newNum = (cs.findCourseById(id).getCurrentSelectNum())+1;
			cs.addOne(id,newNum);
			List<Course> unattendedCourses = es.findCourseNotEnroll(userDetails.getId());
			model.addAttribute("unattendedCourses", unattendedCourses);
			return "EnrollCourse";
		}
		else
			return "Message";
					
	}
	
	/*@RequestMapping("/student/enrollcourse/{id}")
	public String EnrollCourse(@PathVariable("id") Integer id, Model model, @SessionAttribute("studentSession") Student s) {
		
		Double capacity =  cs.findCapacityById(id);
		Double currentSelectNum = cs.findcurrentSelectNumById(id);
		if(cs.Compare(capacity,currentSelectNum)==true) {
			es.enrollCourse(s.getId(), id);
			Integer newNum = (cs.findCourseById(id).getCurrentSelectNum())+1;
			cs.addOne(id,newNum);
			List<Course> unattendedCourses = es.findCourseNotEnroll(s.getId());
			model.addAttribute("unattendedCourses", unattendedCourses);
			return "EnrollCourse";
		}
		else
			return "Message";
					
	}*/
	
	@RequestMapping("/logout")
	public String Logout(@AuthenticationPrincipal MyUserDetails userDetails) {		
		
		return "index";
	}

	/*@RequestMapping("/logout")
	public String Logout(HttpSession session) {
		
		session.removeAttribute("studentSession");
		
		return "Home";
	}*/

}