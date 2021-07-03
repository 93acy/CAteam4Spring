package com.example.cateam4spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.LecturerRepository;

@Service
public class AdminEnrolmentLecturerCourseServiceImpl implements AdminEnrolmentLecturerCourseService {
	
	@Autowired
	LecturerRepository lrepo;
	
	@Autowired
	CourseRepository crepo;
	
	@Override
	public List<Lecturer> findLecturersInCourse(Integer id) {
		return lrepo.findLecturersInCourse(id);
	}

	@Override
	public List<Lecturer> findLecturersNotInCourse(Integer id) {
		return lrepo.findLecturersNotInCourse(id);
	}

	@Override
	public void addLecturerToCourse(Integer Lid, Integer Cid) {
		Lecturer lecturer = lrepo.getById(Lid);
		Course course = crepo.getById(Cid);
		lecturer.getCourses().add(course);
		lrepo.save(lecturer);
	}

	@Override
	public void deleteLecturerInCourse(Integer Cid, Integer Lid) {
		Lecturer lecturer = lrepo.getById(Lid);
		Course course = crepo.getById(Cid);
		lecturer.getCourses().remove(course);
		lrepo.save(lecturer);
	}

}
