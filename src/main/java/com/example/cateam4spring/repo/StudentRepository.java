package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.cateam4spring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	public Student findStudentByIdAndPassword(Integer id, String password);
	
	public Student findStudentById(Integer id);
	
	@Query("SELECT s.GPA FROM Student s WHERE s.id = :id")
	public Integer findGpaById(@Param("id") Integer id);



}
