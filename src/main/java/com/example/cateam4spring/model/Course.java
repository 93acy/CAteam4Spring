package com.example.cateam4spring.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="course_id")
	private int id;
	private String name;
	private String description;
	private int capacity;
	private int credit;
	
	private Date startDate;
	
	
	  @ManyToMany(mappedBy = "courses") 
	  private Collection<Lecturer> lecturers;
	  
	  @ManyToMany(mappedBy = "courses") 
	  private Collection<Student> students;
	  	  

	public Course(String name, String description, int capacity, int credit, Date startDate) {
		super();
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
	}


	public Course(int id, String name, String description, int capacity, int credit, Date startDate,
			Collection<Lecturer> lecturers, Collection<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
		this.lecturers = lecturers;
		this.students = students;
	}


	public Course(String name, String description, int capacity, int credit, Date startDate,
			Collection<Lecturer> lecturers, Collection<Student> students) {
		super();
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
		this.lecturers = lecturers;
		this.students = students;
	}

	
	
	
	
	
	

}
