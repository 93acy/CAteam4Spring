package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {

}
