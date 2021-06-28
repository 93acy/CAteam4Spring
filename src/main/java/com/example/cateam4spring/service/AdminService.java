package com.example.cateam4spring.service;


import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Student;

import java.util.List;

public interface AdminService {

    public void enrolStudent(Enrolment e);
    public boolean checkAvailability(Course c);
    public void editStudent(Student s);
    public void editLecturer(Lecturer l);
    public List<Student> listStudents();
    public void RemoveEnrolment(Student s, Course c);
    
}
