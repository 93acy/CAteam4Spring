package com.example.cateam4spring;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Role;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.model.User;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.repo.LecturerRepository;
import com.example.cateam4spring.repo.StudentRepository;
import com.example.cateam4spring.repo.UserRepository;



@SpringBootApplication
public class CAteam4SpringApplication {

	@Autowired
	StudentRepository srepo;

	@Autowired
	CourseRepository crepo;

	@Autowired
	LecturerRepository lrepo;
	
	@Autowired
	UserRepository urepo;

	@Autowired
	EnrolmentRepository erepo;

	public static void main(String[] args) {
		SpringApplication.run(CAteam4SpringApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			Student s1 = new Student("HA","HA", 4.0, null);
			Student s2 = new Student("J","J", 4.4, null);
			Student s3 = new Student("D","D", 4.3, null);			
			srepo.save(s1);	srepo.save(s2);	srepo.save(s3);	
			
			
			
			Course c1 = new Course("Math","this is a math course", 50, 6, null);
   		    Course c2 = new Course("Science","this is a science course", 45, 8, null);
			crepo.save(c1); crepo.save(c2);
			Collection<Course> courses = new ArrayList<>();
			courses.add(c1);courses.add(c2);
			
			Lecturer l1 = new Lecturer("K","K");
			l1.setCourses(courses);
			Collection<Lecturer> lecturers = new ArrayList<>();
			lecturers.add(l1);
			lrepo.save(l1);
			
			Enrolment e1 = new Enrolment(true,null, 78.0);
			Enrolment e2 = new Enrolment(false,null, 30.0);			
			e1.setCourse(c1); e2.setCourse(c2);
			e1.setStudent(s1); e2.setStudent(s2); 
			erepo.save(e1); erepo.save(e2);
			Collection<Enrolment> erms = new ArrayList<>();
			erms.add(e2); 
			
		    s1.setEnrolments(erms);
		    s2.setEnrolments(erms);
		    
		    erms.add(e1);
		    s3.setEnrolments(erms);
		    
			l1.setCourses(courses);
			
			Role ADMIN = new Role("ADMIN");
			Role STUDENT = new Role("STUDENT");
			Role LECTURER = new Role("LECTURER");
			
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String rawPassword1 = "admin";
			String encodedPassword1 = encoder.encode(rawPassword1);
			User admin = new User("admin", encodedPassword1, true);
			admin.getRoles().add(ADMIN);
			
			String rawPassword2 = "student";
			String encodedPassword2 = encoder.encode(rawPassword2);
			User student = new User("student", encodedPassword2, true);
			student.getRoles().add(STUDENT);
			
			String rawPassword3 = "lecturer";
			String encodedPassword3 = encoder.encode(rawPassword3);
			User lecturer = new User("lecturer", encodedPassword3,true);
			lecturer.getRoles().add(LECTURER);
			
			urepo.save(admin);
			urepo.save(student);
			urepo.save(lecturer);

		};
	}

}
