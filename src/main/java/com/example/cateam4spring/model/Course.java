package com.example.cateam4spring.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
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
	private Integer currentSelectNum=4;

	  @ManyToMany(mappedBy = "courses")
	  private Collection<Lecturer> lecturers;
	  
	  @OneToMany(mappedBy = "course")
	  private Collection<Enrolment> Enrolments;
	  
		public Course() {
			super();
		}



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



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public int getCredit() {
		return credit;
	}



	public void setCredit(int credit) {
		this.credit = credit;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Collection<Lecturer> getLecturers() {
		return lecturers;
	}



	public void setLecturers(Collection<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}



	public Collection<Enrolment> getEnrolments() {
		return Enrolments;
	}



	public void setEnrolments(Collection<Enrolment> enrolments) {
		Enrolments = enrolments;
	}



	public Integer getCurrentSelectNum() {
		return currentSelectNum;
	}



	public void setCurrentSelectNum(Integer currentSelectNum) {
		this.currentSelectNum = currentSelectNum;
	}
	
	
	
}
