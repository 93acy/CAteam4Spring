package sg.edu.iss.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
class LecturerController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/lecturerhome")
	public String home() {
		return "lecturer/lecturerhome";
	}
	
	@GetMapping("/viewcourses")
	public String viewCourses(Model model) {
		return "lecturer/ViewCourses";
	}
	
	@GetMapping("/studentlist")
	public String studentList(Model model) {
		return "lecturer/StudentList";
	}
	
	@GetMapping("/inputgrades")
	public String inputgrades(Model model) {
		return "lecturer/InputGrades";
	}
	
	@GetMapping("/studentperformance")
	public String studentperformance(Model model) {
		return "lecturer/StudentPerformance";
	}
	}



