package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.repo.LecturerRepository;
import com.example.cateam4spring.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdminServiceImpl {
    @Autowired
    EnrolmentRepository erepo;

    @Autowired
    StudentRepository srepo;

    @Autowired
    LecturerRepository lrepo;

    @Autowired
    CourseRepository crepo;

    @Transactional
    public void enrolStudent(Enrolment e){
        erepo.save(e);
    }






}
