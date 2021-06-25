package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
