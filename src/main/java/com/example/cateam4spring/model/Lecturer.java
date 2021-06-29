package com.example.cateam4spring.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Lecturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
		
	 @ManyToMany
	 @JoinTable(name="courseAllocation",
	 joinColumns = @JoinColumn(name="lecturer_id"),
	 inverseJoinColumns = @JoinColumn(name="course_id")) 
	 private Collection<Course> courses;
	 
	
	public Lecturer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Lecturer(String firstName, String lastName, Collection<Course> courses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
	}


	public Lecturer(int id, String firstName, String lastName, Collection<Course> courses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
	}
	
	

	

	 
	
	
	
	

}

