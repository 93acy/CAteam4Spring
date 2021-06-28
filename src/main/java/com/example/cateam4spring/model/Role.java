package com.example.cateam4spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
//	@ManyToMany(cascade = CascadeType.PERSIST) 
//	@JoinTable(name = "USER_ROLES",        joinColumns = @JoinColumn(name = "ROLE_ID"),        inverseJoinColumns = @JoinColumn(name = "USER_ID")) 
//	private Set<User> users = new HashSet<>();
	
	public Role() {
		super();
	}

	public Role(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
