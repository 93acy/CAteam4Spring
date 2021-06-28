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
public class Lecturer extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="lecturer_id")
	private Integer id;
	private String firstName;
	private String lastName;
	
	
	 @ManyToMany
	 @JoinColumn(name="lecturer_course", referencedColumnName="course_id") 
	 private Collection<Course> courses;
	 
	
	 public Lecturer(String username, String password, boolean enabled, String firstName, String lastName) {
		   super(username, password, enabled);
		   this.firstName = firstName;
		   this.lastName = lastName;
	 }	
}

