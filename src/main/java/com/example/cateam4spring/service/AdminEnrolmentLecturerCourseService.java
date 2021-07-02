package com.example.cateam4spring.service;

import java.util.List;

import com.example.cateam4spring.model.Lecturer;

public interface AdminEnrolmentLecturerCourseService {

	public List<Lecturer> findLecturersInCourse(Integer id);
	
	public List<Lecturer> findLecturersNotInCourse(Integer id);
	
	public void addLecturerToCourse(Integer Lid, Integer Cid);
	
	public void deleteLecturerInCourse( Integer Cid, Integer Lid);
}
