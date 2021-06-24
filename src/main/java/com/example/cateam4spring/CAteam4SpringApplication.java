package com.example.cateam4spring;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.LecturerRepository;
import com.example.cateam4spring.repo.StudentRepository;

@SpringBootApplication
public class CAteam4SpringApplication {
	
	@Autowired
	StudentRepository srepo;
	
	@Autowired
	CourseRepository crepo;
	
	@Autowired
	LecturerRepository lrepo;

	public static void main(String[] args) {
		SpringApplication.run(CAteam4SpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			
			Student s1 = new Student("HA","HA", 4.0 ,null);
			srepo.save(s1);	
			
			Lecturer l1 = new Lecturer("K","K");
			lrepo.save(l1);
			
			Course c1 = new Course("Math","this is a math course", 50, 6, null);
			Course c2 = new Course("Science","this is a science course", 45, 8, null);
			crepo.save(c1); crepo.save(c2);
			Collection<Course> courses = new ArrayList<>();
			courses.add(c1);courses.add(c2);
			
			s1.setCourses(courses);
			l1.setCourses(courses);
			
			
		};
		}

}
