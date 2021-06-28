package com.example.cateam4spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Enrolment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean courseStatus;
	private Date enrolmentDate;
	private double grade;
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Course course;

	public Enrolment(int id, boolean courseStatus, Date enrolmentDate, double grade, Student student, Course course) {
		super();
		this.id = id;
		this.courseStatus = courseStatus;
		this.enrolmentDate = enrolmentDate;
		this.grade = grade;
		this.student = student;
		this.course = course;
	}

	public Enrolment(boolean courseStatus, Date enrolmentDate, double grade, Student student, Course course) {
		super();
		this.courseStatus = courseStatus;
		this.enrolmentDate = enrolmentDate;
		this.grade = grade;
		this.student = student;
		this.course = course;
	}

	public Enrolment(boolean courseStatus, Date enrolmentDate, double grade) {
		super();
		this.courseStatus = courseStatus;
		this.enrolmentDate = enrolmentDate;
		this.grade = grade;
	}
	
	

    
}
