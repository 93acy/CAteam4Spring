package com.example.cateam4spring.controller;


import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/admin_student")
public class AdminStudentController {
//
//    @Autowired
//    private EnrolmentService enrolmentService;
//


    @GetMapping("/enrol")
    public String enrolStudent(){
        return "Admin/admin_home";
    }

    @GetMapping("/edit")
    public String editStudent(){
        return "Admin/admin_home";
    }

    @GetMapping("/delete")
    public String deleteStudent(){
        return "Admin/admin_home";
    }



//    @RequestMapping(value="/list")
//    public ModelAndView studentlistPage(){
//        ModelAndView mav = new ModelAndView("student-list");
//        List<Student> studentlist = studentService.findAll();
//        mav.addObject("studentlist",studentlist);
//        return mav;
//    }
//
//    @RequestMapping(value= "/edit/{id}", method = RequestMethod.POST)
//    public ModelAndView(@ModelAttribute Student student, BindingResult result,)
//        @PathVariable String id){



    }




