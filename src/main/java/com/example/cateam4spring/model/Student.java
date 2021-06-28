package com.example.cateam4spring.model;


import java.util.Collection;
import java.util.Date;

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
public class Student extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String FirstName;
	private String LastName;	
	private Double GPA;
	private Date enrollmentDate;

	@OneToMany(mappedBy="student") 
	private Collection<Enrolment> enrolments;
	public Student(String username, String password, boolean enabled, String firstName, String lastName, double GPA, Date enrollmentDate) {
		super(username, password, enabled);
		FirstName = firstName;
		LastName = lastName;
		this.GPA = GPA;
		this.enrollmentDate = enrollmentDate;
	}
}
