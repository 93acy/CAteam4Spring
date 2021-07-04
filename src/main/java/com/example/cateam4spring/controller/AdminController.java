package com.example.cateam4spring.controller;

import java.util.List;

import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.service.AdminStudentService;
import com.example.cateam4spring.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.service.AdminLecturerService;
import com.example.cateam4spring.service.CourseService;
import com.example.cateam4spring.service.StudentService;

@Controller
@RequestMapping(value="/admin_home")
public class AdminController {

    @Autowired
    private AdminLecturerService alservice;

    @Autowired
    private CourseService cservice;

    @Autowired
    private AdminStudentService asservice;
    
    @Autowired
    private StudentService sservice;

    @GetMapping("/home")
    public String returnHome() {
        return "Admin/admin_home";
    }

    @GetMapping("/student")
    public String AdminStudent(Model model, String keyword) {
    	if(keyword !=null) {
			model.addAttribute("listStudents", sservice.findByKeyword(keyword));
		}		
		else {
			model.addAttribute("listStudents", sservice.findAllStudents());	
		}
        return "Admin/admin_student"; //return view from templates
    }

    @GetMapping("/lecturer")
    public String AdminLecturer(Model model) {
        List<Lecturer> listLecturers = alservice.listAll();
        model.addAttribute("listLecturers", listLecturers);
        return "Admin/admin_lecturer";
    }

    @GetMapping("/enrolment")
    public String AdminEnrolment(Model model) {
        List<Student> listStudents = asservice.listAll();
        List<Course> listCourses = cservice.findAllCourses();
        model.addAttribute("listStudents", listStudents);
        model.addAttribute("listcourses", listCourses);
        return "Admin/admin_enrolment";
    }

    @GetMapping("/course")
    public String AdminCourse(Model model, String keyword) {
    	if (keyword !=null) {
			model.addAttribute("listCourses", cservice.findByKeyword(keyword));
		}		
		else {
			model.addAttribute("listCourses", cservice.findAllCourses());	
		}
        return "Admin/admin_course";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "index";
    }
}