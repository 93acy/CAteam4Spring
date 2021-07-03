package com.example.cateam4spring.service;

//import com.example.cateam4spring.model.Student;

import com.example.cateam4spring.model.Student;

public interface StudentService {
	
	//public boolean Authenticate(Student Student);

	Student findStudentById(Integer id);
	
	public Integer findGpaById(Integer id);



}
