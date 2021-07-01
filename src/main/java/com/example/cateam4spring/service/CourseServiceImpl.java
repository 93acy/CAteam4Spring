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
	public List<Course> findByKeyword(String keyword) {

		return crepo.findByKeyword(keyword);
	}

}
