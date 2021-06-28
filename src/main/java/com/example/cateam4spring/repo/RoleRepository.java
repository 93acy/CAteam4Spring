package com.example.cateam4spring.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.cateam4spring.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	public Role findRoleById(Integer id);
	public Role findRoleByName(String name);
}
