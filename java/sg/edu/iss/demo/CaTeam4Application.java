package sg.edu.iss.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import sg.edu.iss.demo.model.Lecturer;
import sg.edu.iss.demo.repo.LecturerRepository;


@SpringBootApplication
public class CaTeam4Application {

	 
	
	/*
	 *
	 * 
	 * @Autowired CourseRepository crepo;
	 * 
	 * @Autowired StudentRepository srepo;
	 */
	
	@Autowired 
	LecturerRepository lrepo;  
	
	public static void main(String[] args) {
		SpringApplication.run(CaTeam4Application.class, args);
			}
			
			  @Bean CommandLineRunner runner() { return args ->{ Lecturer l1 = new
			  Lecturer(0001, "Tony", "Stark"); 
			  Lecturer l2 = new Lecturer(0002, "Suria", "Asai"); 
			  List<Lecturer> llist = new ArrayList<Lecturer>();
			  llist.add(l1);llist.add(l2); lrepo.saveAll(llist); }; }
			 

	/*
	 * @Bean CommandLineRunner runner() { return args -> {
	 * 
	 * Lecturer lecturer1 = new Lecturer(001, "Megan","Wong");
	 * lrepo.save(lecturer1);
	 * 
	 * Course course1 = new Course (1, "Math", "Addition and Subtraction", 50, 5);
	 * crepo.save(course1); Collection<Course> courses = new ArrayList<>();
	 * courses.add(course1);
	 * 
	 * 
	 * lecturer1.setCourses(courses); }; }
	 */
		
			

}
