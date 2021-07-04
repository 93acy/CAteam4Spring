package com.example.cateam4spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.repo.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository crepo;

	@Override
	public List<Course> findAll() {
		return crepo.findAll();
	}
	@Override
	public Double findCapacityById(Integer Id) {
		return crepo.findCapacityById(Id);
	}

	@Override
	public Double findcurrentSelectNumById(Integer Id) {
		return crepo.findcurrentSelectNumById(Id);
	}

	@Override
	public Boolean Compare(Double capacity, Double currentSelectNum) {
		return (capacity > currentSelectNum)? true: false;
	}

	@Override
	public void addOne(Integer Id,Integer newNum) {
		crepo.addOne(Id, newNum);
	}

	@Override
	public Course findCourseById(Integer id) {
		return crepo.findCourseById(id);
	}

	@Override
	public void minusOne (Integer Id,Integer newNum) {
		crepo.minusOne(Id, newNum);
	}

	@Override
	public List<Course> findByKeyword(String keyword) {

		return crepo.findByKeyword(keyword);
	}

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
	public void delete(Integer id) {
		crepo.deleteById(id);
	}
}
