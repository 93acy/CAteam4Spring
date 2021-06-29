package com.example.cateam4spring.model;

//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
//@NoArgsConstructor
//@Data
@Entity
public class Enrolment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean courseStatus;		
    private Date enrolmentDate;			
    private double grade;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;
    
	public Enrolment() {
		super();
	}

    public Enrolment(boolean courseStatus, Date enrolmentDate, double grade, Student student, Course course) {
        this.courseStatus = courseStatus;
        this.enrolmentDate = enrolmentDate;
        this.grade = grade;
        this.student = student;
        this.course = course; }


    public Enrolment(boolean courseStatus, Date enrolmentDate, double grade) {
        super();
        this.courseStatus = courseStatus;
        this.enrolmentDate = enrolmentDate;
        this.grade = grade;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(boolean courseStatus) {
		this.courseStatus = courseStatus;
	}

	public Date getEnrolmentDate() {
		return enrolmentDate;
	}

	public void setEnrolmentDate(Date enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
    
    


}
