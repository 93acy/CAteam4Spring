package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    //public List<Course> findAll();

    //@Query("SELECT c.capacity FROM Course c WHERE c.id = :Id")
    //public Double findCapacityById(@Param("Id") String Id);
    
	public List<Course> findAll();
	
	@Query("SELECT c.capacity FROM Course c WHERE c.id = :Id")
	public Double findCapacityById(@Param("Id") Integer Id);
	
	@Query("SELECT c.currentSelectNum FROM Course c WHERE c.id = :Id")
	public Double findcurrentSelectNumById(@Param("Id") Integer Id);
		
	@Modifying
	@Transactional
	@Query(value = "UPDATE course SET current_select_num = :newNum WHERE id = :Id", nativeQuery=true)
	public void addOne(@Param("Id") Integer Id, @Param("newNum") Integer newNum);
	
	public Course findCourseById(Integer Id);


}
