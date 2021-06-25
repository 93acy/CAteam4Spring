package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
