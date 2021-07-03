package com.example.cateam4spring.model;

import java.util.Collection;
//import java.util.Set;

import javax.persistence.*;

//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
@Entity
public class Lecturer extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="lecturer_id")
	private Integer id;
	private String firstName;
	private String lastName;
	
	 @ManyToMany
	 @JoinTable(name="course_Allocation",
	 joinColumns= @JoinColumn(name="lecturer_id"),
	 inverseJoinColumns= @JoinColumn(name="course_id"))
	 private Collection<Course> courses;

		public Lecturer() {
			super();
		}

	public Lecturer(String username, String password, boolean enabled, String firstName, String lastName) {
		super(username, password, enabled);
		this.firstName = firstName;
		this.lastName = lastName;
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

	public void setLastName(String lastName) { this.lastName = lastName; }

	public Collection<Course> getCourses() {
		return courses;
	}

	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}
	
	
}

