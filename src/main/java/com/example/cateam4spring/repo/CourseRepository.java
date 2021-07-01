package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    public List<Course> findAll();

    @Query("SELECT c.capacity FROM Course c WHERE c.id = :Id")
    public Double findCapacityById(@Param("Id") String Id);
    
    @Query("SELECT c FROM Course c WHERE "
    		+ "CONCAT(c.name,c.id)"
    		+ "LIKE %:keyword%")
    public List<Course> findByKeyword(@Param("keyword") String keyword);


}
