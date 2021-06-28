package sg.edu.iss.CA.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import sg.edu.iss.CA.model.Course;
import sg.edu.iss.CA.model.Enrollment;
import sg.edu.iss.CA.model.Student;
import sg.edu.iss.CA.service.CourseService;
import sg.edu.iss.CA.service.EnrollmentService;
import sg.edu.iss.CA.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@Autowired
	private CourseService cs;
	
	@Autowired
	private EnrollmentService es;
	 
	@RequestMapping("/home")
	public String ShowHomePage() {
		
		return "Home";
	}
	
	@RequestMapping("/login/student")
	public String StudentLogin(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		return "StudentLogin";
	}
	
	@RequestMapping("/login/authenticate")
	public String Authenticate(@ModelAttribute("student") Student student, Model model, HttpSession session) {
		
		if(ss.Authenticate(student)) {
			Student s = ss.findStudentById(student.getId());
			session.setAttribute("studentSession", s);
			return "Dashboard";	
		}
			
		else 
			return "StudentLogin";
		
	}
	
	@RequestMapping("/student/gradeandgpa")
	public String ViewGradeAndGpa(Model model, @SessionAttribute("studentSession") Student s) {
		
		List<Enrollment> enrollments = es.findEnrollmentById(s.getId());
		model.addAttribute("enrollments", enrollments);
		
		return "GradeAndGPA";
	}
	
	@RequestMapping("/student/viewcourse")
	public String ViewCourse(Model model, @SessionAttribute("studentSession") Student s) {
		
		List<Course> allCourses = cs.findAll();
		model.addAttribute("allCourses", allCourses);
		
		return "ViewCourse";
		
	}
	
	@RequestMapping("/student/dashboard")
	public String ViewCourse(@SessionAttribute("studentSession") Student s) {
		
		return "Dashboard";
		
	}
	
	@RequestMapping("/student/enrollcourse")
	public String ShowEnrollCoursePage(Model model, @SessionAttribute("studentSession") Student s) {
		
		List<Course> unattendedCourses = es.findCourseNotEnroll(s.getId());
		model.addAttribute("unattendedCourses", unattendedCourses);
			
		return "EnrollCourse";
	}
	
	@RequestMapping("/student/enrollcourse/{id}")
	public String EnrollCourse(@PathVariable("id") String id, Model model, @SessionAttribute("studentSession") Student s) {
		
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
					
	}

	@RequestMapping("/logout")
	public String Logout(HttpSession session) {
		
		session.removeAttribute("studentSession");
		
		return "Home";
	}

}
