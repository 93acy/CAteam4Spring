package com.example.cateam4spring.model;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;	
	private Double GPA;
	@OneToMany(mappedBy="student") 
	private Collection<Enrolment> enrolments;
	
	public Student(int id, String firstName, String lastName, Double gPA, Collection<Enrolment> enrolments) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
		this.enrolments = enrolments;
	}

	public Student(String firstName, String lastName, Double gPA, Collection<Enrolment> enrolments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
		this.enrolments = enrolments;
	}

	public Student(String firstName, String lastName, Double gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
	}
	
	
	 


	
	
	
	
	

}
