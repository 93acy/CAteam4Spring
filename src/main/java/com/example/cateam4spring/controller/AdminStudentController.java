package com.example.cateam4spring.controller;


import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/student")
public class AdminStudentController {
    @Autowired
    private EnrolmentService enrolmentService;

    private StudentService studentService;


}
