package sg.edu.iss.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import sg.edu.iss.demo.model.Lecturer;
import sg.edu.iss.demo.repo.LecturerRepository;

@Controller
public class AdminController {

	@GetMapping("/adminhome")
	public String home() {
		return "admin/adminhome";
	}
	
	
	@GetMapping("/managecourses")
	public String manageCourses() {
		return "admin/managecourses";
	}
	
	@GetMapping("/managecourses2")
	public String manageCourses2() {
		return "admin/managecourses2";
	}
	
	@Autowired
	LecturerRepository lrepo;
	@GetMapping("/managelecturers")
	public String manageLecturers(Model model) {
		ArrayList<Lecturer> llist = (ArrayList<Lecturer>) lrepo.findAll();
		model.addAttribute("llist",llist);
		return "admin/managelecturers";
	}
	
	@GetMapping("/managelecturers2")
	public String manageLecturers2() {
		return "admin/managecourses2";
	}
	
	@GetMapping("/managestudents")
	public String manageStudents() {
		return "admin/managestudents";
	}
	
	@GetMapping("/managestudents2")
	public String manageStudents2() {
		return "admin/managestudents2";
	}
}
