package com.example.cateam4spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository crepo;
	
	@Override
	public void saveCourse(Course course) {
		crepo.save(course);
	}
	
	@Override
	public List<Course> findAllCourses() {
		return crepo.findAll();
	}

	@Override
	public Course findCourse(Integer cid) {
		return crepo.getById(cid);
	}

	@Override
	public void deleteCourseById(Integer id) {
		crepo.deleteById(id);
	}

	
}
