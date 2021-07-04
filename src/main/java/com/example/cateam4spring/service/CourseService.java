package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Lecturer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface CourseService {

	List<Course> findAll();
	Double findCapacityById(Integer Id);
	Double findcurrentSelectNumById(Integer Id);
	Boolean Compare(Double capacity, Double currentSelectNum);
	void addOne(Integer Id,Integer newNum);
	Course findCourseById(Integer id);
	void minusOne (Integer Id,Integer newNum);
    List<Course> findByKeyword(String keyword);
    public void saveCourse(Course course);

    public List<Course> findAllCourses();
    //
//    ArrayList<Course> findCourseByEnrolmentId(Integer eid);
//
    public Course findCourse(Integer cid);
    
    public void delete(Integer id);

    


}
