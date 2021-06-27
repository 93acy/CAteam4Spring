package com.example.cateam4spring.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Enrolment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Student student;

    private String courseStatus;
    private Date startDate;

    private String grade;

    public Enrolment(Integer enrolId, Course courseId, Student studentId, String courseStatus, Date startDate, String grade) {
        this.Id = enrolId;
        this.course = courseId;
        this.student = studentId;
        this.courseStatus = courseStatus;
        this.startDate = startDate;
        this.grade = grade;
    }

    public Enrolment() {
    }

    //Student-course


}
