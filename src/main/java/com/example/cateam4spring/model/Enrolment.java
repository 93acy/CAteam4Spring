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
    private String courseStatus;		
    private String enrolmentDate;			
    private Double grade=0.0;
    private Double point;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;
    
	public Enrolment() {
		super();
	}

    public Enrolment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
	
    public Enrolment(String courseStatus, String enrolmentDate, Double grade, Student student, Course course) {
        this.courseStatus = courseStatus;
        this.enrolmentDate = enrolmentDate;
        this.grade = grade;
        this.student = student;
        this.course = course; }


    public Enrolment(String courseStatus, String enrolmentDate, Double grade) {
        super();
        this.courseStatus = courseStatus;
        this.enrolmentDate = enrolmentDate;
        this.grade = grade;
    }
    
    

	public Enrolment(String courseStatus, String enrolmentDate, Double grade, Double point) {
		super();
		this.courseStatus = courseStatus;
		this.enrolmentDate = enrolmentDate;
		this.grade = grade;
		this.point = point;
	}
	
	

	public Enrolment(Integer id, String courseStatus, String enrolmentDate, Double grade, Double point) {
		super();
		this.id = id;
		this.courseStatus = courseStatus;
		this.enrolmentDate = enrolmentDate;
		this.grade = grade;
		this.point = point;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	//get course status
		public String updateCourseStatus() {
	        Double g = this.grade;
	       
	        if(g>=90 && g<=100) {           
	            this.point = 5.0;
	            return "A";
	        }
	           
	       
	        else if(g>=80 && g<=89) {           
	            this.point = 4.0;
	            return "B";
	        }
	           
	       
	        else if(g>=70 && g<=79) {           
	            this.point = 3.0;
	            return "C";
	        }
	           
	       
	        else if(g>=60 && g<=69) {           
	            this.point = 2.0;
	            return "D";
	        }
	       
	        else {
	            this.point = 1.0;
	            return "F";
	        }
			

	}
	
	public Double getPoint() {
		return this.point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	//set course status
	public void setCourseStatus() {
		String status = updateCourseStatus();
		this.courseStatus=status;
		
	}
	
	

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public String getEnrolmentDate() {
		return enrolmentDate;
	}

	public void setEnrolmentDate(String enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
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
