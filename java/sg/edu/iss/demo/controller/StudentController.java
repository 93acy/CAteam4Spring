package sg.edu.iss.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	
	@GetMapping("/studenthome")
	public String home() {
		return "student/studenthome";
	}
	
	@GetMapping("/mycourses")
	public String myCourses() {
		return "student/mycourses";
	}
	
	@GetMapping("/myresults")
	public String myResults() {
		return "student/myresults";
	}
	
	@GetMapping("/myenrolments")
	public String myEnrolments() {
		return "student/myenrolments";
	}
}
