package com.example.cateam4spring.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Admin extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String FirstName;
	private String LastName;
	
	public Admin(Integer id, String username, String password, boolean enabled, Set<Role> roles, Integer id2,
			String firstName, String lastName) {
		super(id, username, password, enabled, roles);
		id = id2;
		FirstName = firstName;
		LastName = lastName;
	}

	public Admin(Integer id, String username, String password, boolean enabled, Set<Role> roles, String firstName,
			String lastName) {
		super(id, username, password, enabled, roles);
		FirstName = firstName;
		LastName = lastName;
	}
	
	
	


}
