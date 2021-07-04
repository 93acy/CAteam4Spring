package com.example.cateam4spring.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
@Entity
public class Student extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;	
	private Double GPA;
	private Date enrollmentDate;
	
	@OneToMany(mappedBy="student")
	 private Collection<Enrolment> enrolments;
	
	public Student() {
		super();
	}

	public Student(String username, String password, boolean enabled, Integer id, String firstName, String lastName) {
		super(username, password, enabled);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

	public Student(String firstName, String lastName, Double gPA, Date enrollmentDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
		this.enrollmentDate = enrollmentDate;
	}

	public Student(String username, String password, boolean enabled, String firstName, String lastName, Double GPA, Date enrollmentDate) {
		super(username, password, enabled);
		this.firstName = firstName;
		this.lastName = lastName;
		this.GPA = GPA;
		this.enrollmentDate = enrollmentDate;
	}
	

	public Student(Integer id, String firstName, String lastName, Double gPA, Date enrollmentDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
		this.enrollmentDate = enrollmentDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public Collection<Enrolment> getEnrolments() {
		return enrolments;
	}

	public void setEnrolments(Collection<Enrolment> enrolments) {
		this.enrolments = enrolments;
	}




}
