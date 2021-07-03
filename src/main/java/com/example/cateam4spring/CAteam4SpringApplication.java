package com.example.cateam4spring;

import antlr.collections.List;
import com.example.cateam4spring.model.*;
import com.example.cateam4spring.repo.*;

//import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Collection;

//import java.util.HashSet;
//import java.util.Optional;
//import java.util.Set;


@SpringBootApplication
public class CAteam4SpringApplication {

	@Autowired
	EnrolmentRepository erepo;

	@Autowired
	StudentRepository srepo;

	@Autowired
	CourseRepository crepo;

	@Autowired
	LecturerRepository lrepo;

	@Autowired
	UserRepository urepo;

	@Autowired
	RoleRepository rrepo;

	@Autowired
	AdminRepository arepo;

	public static void main(String[] args) {
		SpringApplication.run(CAteam4SpringApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

//			Student s1 = new Student("HA","HA", 4.0 ,null);
//			srepo.save(s1);
//
//			Lecturer l1 = new Lecturer("K","K");
//			lrepo.save(l1);
//
//			Collection<Course> courses = new ArrayList<>();
//			courses.add(c1);courses.add(c2);
//
//			s1.setCourses(courses);
//			l1.setCourses(courses);

//			Role ADMIN = new Role("ADMIN");
//			Role STUDENT = new Role("STUDENT");
//			Role LECTURER = new Role("LECTURER");
//
		    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//			String rawPassword1 = "admin";
//			String encodedPassword1 = encoder.encode(rawPassword1);
//			Admin admin = new Admin("admin", encodedPassword1, true);
//			admin.getRoles().add(ADMIN);
//			arepo.save(admin);
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
//
//			urepo.save(admin);
//			urepo.save(student);
//			urepo.save(lecturer);

			rrepo.save(new Role("STUDENT"));
			rrepo.save(new Role("LECTURER"));
			rrepo.save(new Role("ADMIN"));

			Role student = rrepo.findRoleByName("STUDENT");
			Role lecturer = rrepo.findRoleByName("LECTURER");
			Role admin= rrepo.findRoleByName("ADMIN");
			
//1
			String rawPassword1 ="admin";
			String encodedPassword1 = encoder.encode(rawPassword1);
			Admin admin1 = new Admin("Admin", encodedPassword1, true, "forever", "Admin");
			arepo.save(admin1);
			admin1.getRoles().add(admin);
			arepo.save(admin1);

			String rawPassword4 ="student";
			String encodedPassword4 = encoder.encode(rawPassword4);
			Student student1 = new Student("joel", encodedPassword4, true, "Joel", "Yeo", 5.0, null);
			srepo.save(student1);
			student1.getRoles().add(student);
			srepo.save(student1);

			String rawPassword5 ="student";
			String encodedPassword5 = encoder.encode(rawPassword5);
			Student student2 = new Student("joel1", encodedPassword5, true, "Joel", "Yeo", 5.0, null);
			srepo.save(student2);
			student2.getRoles().add(student);
			srepo.save(student2);

			Course c1 = new Course("Math","this is a math course", 50, 6, null);
			Course c2 = new Course("Science","this is a science course", 45, 8, null);
			crepo.save(c1); crepo.save(c2);
			Collection<Course> courses1 = new ArrayList<>();
			Collection<Course> courses2 = new ArrayList<>();
			courses1.add(c1);courses1.add(c2);
			courses2.add(c1);

			String rawPassword6 = "lecturer";
			String encodedPassword6 = encoder.encode(rawPassword6);
			Lecturer lecturer1 = new Lecturer("tin", encodedPassword6, true, "Nguyen", "Tri");
			lecturer1.setCourses(courses1);
			lrepo.save(lecturer1);
			lecturer1.getRoles().add(lecturer);
			lrepo.save(lecturer1);


			String rawPassword3 ="lecturer";
			String encodedPassword3 = encoder.encode(rawPassword3);
			Lecturer lecturer2 = new Lecturer("L001", encodedPassword3, true, "Surai", "Asai");
			lecturer2.getRoles().add(lecturer);
			lecturer2.setCourses(courses2);
//			Collection<Lecturer> lecturers = new ArrayList<>();
//			lecturers.add(lecturer1);
			lrepo.save(lecturer2);
			lecturer1.getRoles().add(lecturer);
			lrepo.save(lecturer2);
//			User a = urepo.getById(1);
//			a.setRoles(Set.of(lecturer, admin));
//			urepo.save(a);
		};
	}

}
