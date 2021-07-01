package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
//import com.example.cateam4spring.model.Student;

import java.util.Date;

//import com.example.cateam4spring.model.Enrolment;

//import java.util.ArrayList;
import java.util.List;

public interface EnrolmentService {

    //ArrayList<Enrolment> findAllEnrolments();

    //ArrayList<Enrolment> findEnrolmentById(String Id);

//  ArrayList<Enrolment> findAllEnrolmentsByCourse(String enrolId);

    //Enrolment createEnrolment(Enrolment e);

   //void enrolCourse(String studentId, String courseId);

    //void deleteEnrolment(Enrolment e);
    //dk if should use integer here



//    Enrolment updateEnrolment(String enrolId);
    //for lecturer to grade and set courseStatus
    
    
    
	public List<Enrolment> findEnrollmentById(Integer Id);
	
	public List<Course> findCourseNotEnroll(Integer Id);

	public void enrollCourse(Integer studentId, Integer courseId, String now);
	
	public List<Course> findEnrolledCourseById(Integer Id);
	
	public void cancelenrollment(Integer studentId, Integer courseId);

}
