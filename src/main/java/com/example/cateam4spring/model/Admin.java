package com.example.cateam4spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
//@Data
//@NoArgsConstructor
public class Admin extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Admin() {
		super();
	}
	

	public Admin(String username, String password, boolean enabled, Set<Role> roles, String firstName, String lastName) {
		super(username, password, enabled, roles);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Admin(String username, String password, boolean enabled, String firstName, String lastName) {
		super(username, password, enabled);
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
