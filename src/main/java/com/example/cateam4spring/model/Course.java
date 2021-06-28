package com.example.cateam4spring.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private int capacity;
	private int credit;
	
	private Date startDate;
	
	
	 @ManyToMany(mappedBy = "courses") 
	 private Collection<Lecturer> lecturers;
	  
	 @OneToMany(mappedBy = "course") 
	 private Collection<Enrolment> enrolments;

	public Course(int id, String name, String description, int capacity, int credit, Date startDate,
			Collection<Lecturer> lecturers, Collection<Enrolment> enrolments) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
		this.lecturers = lecturers;
		this.enrolments = enrolments;
	}

	public Course(String name, String description, int capacity, int credit, Date startDate,
			Collection<Lecturer> lecturers, Collection<Enrolment> enrolments) {
		super();
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
		this.lecturers = lecturers;
		this.enrolments = enrolments;
	}

	public Course(String name, String description, int capacity, int credit, Date startDate) {
		super();
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
	}
	  	  

	 
	
	
	
	
	
	

}
