package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.cateam4spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("Select u from User u where u.username = :username")
	public User getUserByUsername(@Param("username") String username);
}
