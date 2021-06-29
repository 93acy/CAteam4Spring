package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByName(String name);
    Role findRoleById(Integer id);
}
