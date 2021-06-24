package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
