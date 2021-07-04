package com.example.cateam4spring;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.repo.StudentRepository;

import antlr.collections.List;

public class EnrolmentRepositoryUnitTest {
	@Autowired
	EnrolmentRepository erepo;
	
	@Autowired
	CourseRepository crepo;
	
	@Autowired
	StudentRepository srepo;
	
	@Test
	@Order(1)
	public void testCreateCourse() {
		// given
		Course c1 = new Course(1, "JAVA", "coding", 50, 6, null,2);
		//when
		Course saved = crepo.save(c1);
		//then
		assertNotNull(saved);
	}
	
	@Test
	@Order(2)
	public void testCreateStudent() {
		// given
		Student s1 = new Student(2, "Feng", "Wan", 4.0, null);
		//when
		Student saved = srepo.save(s1);
		//then
		assertNotNull(saved);
	}
	
	@Test
	@Order(3)
	public void testCreateEnrolment() {
		// given
		Course c1 = new Course(1,"JAVA", "coding", 50, 6, null,2);
		Student s1 = new Student(2,"Feng", "Wan", 4.0, null);
		Enrolment e1 = new Enrolment(1, "A",null,91.0,5.0);
		crepo.save(c1);
		srepo.save(s1);
		e1.setCourse(c1);
		e1.setStudent(s1);
		//when
		Enrolment saved = erepo.save(e1);
		//then
		assertNotNull(saved);
	}
	
	@Test
	@Order(4)
	public void testFindCourseNotEnrolled() {
		
		Integer eid = 1; 

		Collection<Integer> i= new ArrayList<Integer>();
		i = erepo.findCourseNotEnrolled(eid);
		
		assertNotNull(i);
	}
		
	
	@Test
	@Order(5)
	public void testFindEnrolmentsByStudentId() {
		
		Integer sid=2;
		
		Collection<Enrolment> enrols = new ArrayList<Enrolment>();		
		enrols = erepo.findEnrolmentsByStudentId(sid);
		
		assertNotNull(enrols);
		
	}
	
	@Test
	@Order(6)
	public void testFindEnrolmentByCourseId() {
		
		Integer cid=1;
		
		Collection<Enrolment> enrols = new ArrayList<Enrolment>();		
		enrols = erepo.findEnrolmentByCourseId(cid);
		
		assertNotNull(enrols);
		
	}
	
	@Test
	@Order(7)
	public void testFindEnrolledCourseById() {
		
		Integer eid=1;
		
		Collection<Course> courses = new ArrayList<Course>();		
		courses= erepo.findEnrolledCourseById(eid);
		
		assertNotNull(courses);
		
	}
	
	@Test
	@Order(8)
	public void testFindStudentByEnrolment() {
		
		Integer eid=1;
			
		Student std= erepo.findStudentByEnrolment(eid);
		
		assertNotNull(std);
		
	}
	

	@Test
	@Order(9)
	public void testFindByKeyword() {
		
		String keyword = "Feng";
		
		Collection<Enrolment> enrols = new ArrayList<Enrolment>();		
		enrols = erepo.findByKeyword(keyword);	
		
		
		assertNotNull(enrols);
		
	}
	
	
	
	@Test
	@Order(10)
	public void testDeleteEnrolment() {
		
		Integer cid=1, sid=2;
		
		erepo.cancelEnrolment(sid,cid);

		assertTrue(erepo.findAll().size()==0);		
	}

}
