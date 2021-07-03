package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository sr;
	
	/*public boolean Authenticate(Student student) {
		Student studentDB = sr.findStudentByIdAndPassword(student.getId(), student.getPassword());
		if (studentDB != null)
			return true;
		else
			return false;
	};*/


	public Student findStudentById(Integer id) {
		return sr.findStudentById(id);
	}
	
	public Integer findGpaById(Integer id) {
		return sr.findGpaById(id);
	}


}
