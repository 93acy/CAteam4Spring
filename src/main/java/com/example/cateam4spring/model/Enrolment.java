package com.example.cateam4spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@Data
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


}
