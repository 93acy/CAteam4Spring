package com.example.cateam4spring.controller;


import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Role;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.LecturerRepository;
import com.example.cateam4spring.repo.RoleRepository;
import com.example.cateam4spring.repo.StudentRepository;
import com.example.cateam4spring.service.AdminLecturerService;
import com.example.cateam4spring.service.AdminStudentService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/admin_student")
public class AdminStudentController {

    @Autowired
    private AdminStudentService asservice;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    RoleRepository rrepo;

    @Autowired
    StudentRepository srepo;

    @RequestMapping("/new")
    public String showNewStudentPage(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "Admin/new_student";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student) {
        String hashedPassword = passwordEncoder.encode(student.getPassword());
        student.setPassword(hashedPassword);
        asservice.save(student);
        Role studentRole = rrepo.findRoleByName("STUDENT");
        student.getRoles().add(studentRole);
        srepo.save(student);
        return "redirect:/admin_home/student"; // basically mainpage plus student sub menu
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("Admin/edit_student"); //bring to edit student html
        Student student = asservice.get(id);
        mav.addObject("student", student);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(name = "id") int id) {
        asservice.delete(id);
        return "redirect:/admin_home/student";
    }
}




