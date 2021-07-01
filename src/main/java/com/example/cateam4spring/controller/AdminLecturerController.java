package com.example.cateam4spring.controller;

import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin_lecturer")
public class AdminLecturerController {

    @GetMapping("/home")
    public String returnHome(){
        return "Admin/admin_home";
    }

    @GetMapping("/student")
    public String AdminStudent(){
        return "Admin/admin_student"; //return view from templates
    }

    @GetMapping("/lecturer")
    public String AdminLecturer(){
        return "Admin/admin_lecturer";
    }

    @GetMapping("/enrolment")
    public String AdminEnrolment(){
        return "Admin/admin_enrolment";
    }

}


