package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Integer> {
}