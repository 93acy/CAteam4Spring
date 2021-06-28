package com.example.cateam4spring;

import java.util.ArrayList;
import java.util.Collection;

import com.example.cateam4spring.model.*;
import com.example.cateam4spring.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class CAteam4SpringApplication {
	@Autowired
	AdminRepository arepo;

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
			Role ADMIN = new Role("ADMIN");
			Role STUDENT = new Role("STUDENT");
			Role LECTURER = new Role("LECTURER");

			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

			String rawPassword1 ="student";
			String encodedPassword1 = encoder.encode(rawPassword1);
			Student student1 = new Student("A001", encodedPassword1, true, "Joel", "Yeo", 5.0, null);
			student1.getRoles().add(STUDENT);
			srepo.save(student1);

			String rawPassword2 ="student";
			String encodedPassword2 = encoder.encode(rawPassword2);
			Student student2 = new Student("A002", encodedPassword2, true, "Feng", "Wan", 5.0, null);
			student1.getRoles().add(STUDENT);
			srepo.save(student2);

			Course c1 = new Course("Math","this is a math course", 50, 6, null);
			Course c2 = new Course("Science","this is a science course", 45, 8, null);
			crepo.save(c1); crepo.save(c2);
			Collection<Course> courses = new ArrayList<>();
			courses.add(c1);courses.add(c2);

			String rawPassword3 ="lecturer";
			String encodedPassword3 = encoder.encode(rawPassword3);
			Lecturer lecturer1 = new Lecturer("L001", encodedPassword3, true, "Surai", "Asai");
			lecturer1.getRoles().add(LECTURER);
			lecturer1.setCourses(courses);
			Collection<Lecturer> lecturers = new ArrayList<>();
			lecturers.add(lecturer1);
			lrepo.save(lecturer1);

			String rawPassword4 = "admin";
			String encodedPassword4 = encoder.encode(rawPassword4);
			Admin admin1 = new Admin("Admin", encodedPassword4, true, "forever", "admin");
			admin1.getRoles().add(ADMIN);
			arepo.save(admin1);



//
//			Enrolment e1 = new Enrolment(true,null, 78.0);
//			Enrolment e2 = new Enrolment(false,null, 30.0);
//			e1.setCourse(c1); e2.setCourse(c2);
//			e1.setStudent(s1); e2.setStudent(s2);
//			erepo.save(e1); erepo.save(e2);
//			Collection<Enrolment> erms = new ArrayList<>();
//			erms.add(e2);
//
//		    s1.setEnrolments(erms);
//		    s2.setEnrolments(erms);
//
//		    erms.add(e1);
//		    s3.setEnrolments(erms);
			

			


//
//			String rawPassword2 = "student";
//			String encodedPassword2 = encoder.encode(rawPassword2);
//			User student = new User("student", encodedPassword2, true);
//			student.getRoles().add(STUDENT);
//
//			String rawPassword3 = "lecturer";
//			String encodedPassword3 = encoder.encode(rawPassword3);
//			User lecturer = new User("lecturer", encodedPassword3,true);
//			lecturer.getRoles().add(LECTURER);
			
//			urepo.save(admin);
//			urepo.save(student);
//			urepo.save(lecturer);

		};
	}

}
