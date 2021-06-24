package com.example.cateam4spring.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="lecturer")
public class Lecturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="lecturer_id")
	private int id;
	private String FirstName;
	private String LastName;
	
	
	 @ManyToMany
	 @JoinColumn(name="lecturer_course", referencedColumnName="course_id") 
	 private Collection<Course> courses;
	 
	
	public Lecturer(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}


	public Lecturer(String firstName, String lastName, Collection<Course> courses) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.courses = courses;
	}


	public Lecturer(int id, String firstName, String lastName, Collection<Course> courses) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.courses = courses;
	}
	
	

	

	 
	
	
	
	

}

