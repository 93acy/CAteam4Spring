package com.example.cateam4spring.model;

import java.util.Collection;
import java.util.Date;

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
@Table(name="student")
public class Student extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="student_id")
	private Integer id;
	private String FirstName;
	private String LastName;	
	private double GPA;
	private Date enrollmentDate;
	
	
	 @ManyToMany
	 @JoinColumn(name="Student_Course", referencedColumnName="course_id") 
	 private Collection<Course> courses;


	public Student(String username, String password, boolean enabled, String firstName, String lastName, double GPA, Date enrollmentDate) {
		   super(username, password, enabled);
		   FirstName = firstName;
		   LastName = lastName;
		   this.GPA = GPA;
		   this.enrollmentDate = enrollmentDate;
		} 
	 
	
	
	
	
	
	
	

}
