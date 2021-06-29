package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
//import com.example.cateam4spring.model.Lecturer;

//import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

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
	
	
	public List<Course> findAll();
	public Double findCapacityById(Integer Id);
	public Double findcurrentSelectNumById(Integer Id);
	public Boolean Compare(Double capacity, Double currentSelectNum);
	public void addOne(Integer Id,Integer newNum);
	public Course findCourseById(Integer id);


}
