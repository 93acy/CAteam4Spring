package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	public Student findStudentByIdAndPassword(Integer id, String password);
	
	public Student findStudentById(Integer id);
}
