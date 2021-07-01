package com.example.cateam4spring.service;

import java.util.List;

import com.example.cateam4spring.model.Course;



public interface CourseService {

//    ArrayList<Course> findAllCourses();
//
//    ArrayList<Course> findCourseByEnrolmentId(Integer eid);
//
//    Course findCourse(Integer cid);
//
//    Course createCourse(Course course);
//
//    Course addLecturertoCourse(Lecturer lecturer, Course course);
//
//    void deleteCourse(Course course);
	
	//get course by keyword
	List<Course> findByKeyword(String keyword);


}
