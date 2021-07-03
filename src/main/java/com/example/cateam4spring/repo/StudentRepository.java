package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.cateam4spring.model.Student;

import javax.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	public Student findStudentByIdAndPassword(Integer id, String password);

	@Query("SELECT s FROM Student s WHERE s.id= :id")
	public Student findStudentById(Integer id);
	
	@Query("SELECT s.GPA FROM Student s WHERE s.id = :id")
	public Double findGpaById(@Param("id") Integer id);

	@Modifying
	@Transactional
	@Query(value = "UPDATE student SET gpa =:GPA WHERE user_id = :Id", nativeQuery=true)
	public void updateGPA(@Param("Id") Integer Id, @Param("GPA") Double GPA);

}
