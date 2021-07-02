package com.example.cateam4spring.service;

//import com.example.cateam4spring.model.Student;

public interface StudentService {
	
	//public boolean Authenticate(Student Student);
	//public Student findStudentById(String id);
	
	public Integer findGpaById(Integer id);
	
	
	public Double calculateGPA(Integer id);
	
//	void updateGpa(Double gpa, Integer id);

}
