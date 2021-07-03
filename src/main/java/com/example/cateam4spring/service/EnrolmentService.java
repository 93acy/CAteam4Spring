package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Student;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

public interface EnrolmentService {

    ArrayList<Enrolment> findAllEnrolments();

    List<Enrolment> findEnrolmentsByStudentId(Integer id);

    List<Enrolment> findEnrolmentByCourseId(Integer id);

    List<Course> findCourseNotEnrolled(Integer Id);

    void enrolCourse(Integer studentId, Integer courseId, String now);

    Enrolment createEnrolment(Enrolment e);

    List<Course> findEnrolledCourseById(Integer Id);

    void cancelEnrolment(Integer studentId, Integer courseId);

    void deleteEnrolment(Enrolment e);

    Enrolment updateEnrolment(Enrolment enrolment);

    void updateGrade(Double newGrade, Integer id);

    void updateCourseStatus();

    Student findStudentByEnrolment(Integer eId);

    Enrolment findEnrolmentById(Integer id);

    List<Enrolment> findByKeyword(String keyword);
}


