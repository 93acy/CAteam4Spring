package com.example.cateam4spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.repo.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository crepo;
	
	public List<Course> findAll() {
		return crepo.findAll();
	}
		
	public Double findCapacityById(Integer Id) {
		return crepo.findCapacityById(Id);
	}
	
	public Double findcurrentSelectNumById(Integer Id) {
		return crepo.findcurrentSelectNumById(Id);
	}
	
	public Boolean Compare(Double capacity, Double currentSelectNum) {
		return (capacity > currentSelectNum)? true: false;
	}
	
	public void addOne(Integer Id,Integer newNum) {
		crepo.addOne(Id, newNum);
	}
	
	public Course findCourseById(Integer id) {
		return crepo.findCourseById(id);
	}

}
