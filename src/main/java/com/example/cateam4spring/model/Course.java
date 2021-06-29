package com.example.cateam4spring.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	private Integer id;
	private String name;
	private String description;
	private int capacity;
	private int credit;
	private Date startDate;

	  @ManyToMany(mappedBy = "courses")
	  private Collection<Lecturer> lecturers;
	  
	  @OneToMany(mappedBy = "course")
	  private Collection<Enrolment> Enrolments;



	public Course(String name, String description, int capacity, int credit, Date startDate) {
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
	}

	public Course(String name, String description, int capacity, int credit, Date startDate, Collection<Lecturer> lecturers, Collection<Enrolment> enrolments) {
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.credit = credit;
		this.startDate = startDate;
		this.lecturers = lecturers;
		Enrolments = enrolments;
	}
}
