package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface CourseService {

	public List<Course> findAllCourses();
//
//    ArrayList<Course> findCourseByEnrolmentId(Integer eid);
//
    public Course findCourse(Integer cid);
//
//    Course createCourse(Course course);
//
//    Course addLecturertoCourse(Lecturer lecturer, Course course);
//
//    void deleteCourse(Course course);


}
