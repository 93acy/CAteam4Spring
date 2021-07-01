package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface EnrolmentService {

    ArrayList<Enrolment> findAllEnrolments();

    public List<Enrolment> findEnrolmentsByStudentId(Integer id);
    
    Optional<Enrolment> findEnrolmentById(Integer id);
    

//  ArrayList<Enrolment> findAllEnrolmentsByCourse(String enrolId);

    Enrolment createEnrolment(Enrolment e);

    void enrolCourse(String studentId, String courseId);

    void deleteEnrolment(Enrolment e);
    //dk if should use integer here



    Enrolment updateEnrolment(Enrolment enrolment);
    //for lecturer to grade and set courseStatus
    
    void updateGrade(Double grade, Integer id);






	



}
