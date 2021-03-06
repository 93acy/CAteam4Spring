package com.example.cateam4spring.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

//import com.example.cateam4spring.model.Student;

import com.example.cateam4spring.model.Student;

public interface StudentService {
	
	//public boolean Authenticate(Student Student);

	Student findStudentById(Integer id);
	
	public Double findGpaById(Integer id);
	
	
	public Double calculateGPA(Integer id);
	
//	void updateGpa(Double gpa, Integer id);
	public List<Student> findByKeyword(String keyword);
	
	public List<Student> findAllStudents();

}
