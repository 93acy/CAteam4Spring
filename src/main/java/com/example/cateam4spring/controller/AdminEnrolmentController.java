package com.example.cateam4spring.controller;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.service.AdminStudentService;
import com.example.cateam4spring.service.CourseService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value="/admin_enrolment")
public class AdminEnrolmentController {

    @Autowired
    private CourseService cservice;

    @Autowired
    private AdminCourseController acservice;

    @Autowired
    private AdminStudentService asservice;

    @Autowired
    private StudentService sservice;

    @Autowired
    private EnrolmentService eservice;

    @GetMapping("/enrolStudent/{id}")
    public String startNewStudentEnrolment(@PathVariable(name = "id")Integer id, Model model){
        Student student = asservice.get(id);
        List<Course> unattendedCourses = eservice.findCourseNotEnrolled(id);
        model.addAttribute("student", student);
        model.addAttribute("unattendedCourses",unattendedCourses);
        return "Admin/admin_enrolmentChooseCourse";
    }

//idk how to to multiple linking
    @GetMapping("/enrolStudent2/{studentId}/{CourseId}") //enrolservice enrolCourse
    public String Enrol(@PathVariable(name = "studentId") Integer sId, @PathVariable(name= "CourseId") Integer cId ){
        Date d = new Date();
        String now= d.toString();
        Double capacity = cservice.findCapacityById(cId);
        Double currentSelectNum = cservice.findcurrentSelectNumById(cId);
        if(cservice.Compare(capacity,currentSelectNum)==true){
            eservice.enrolCourse(sId, cId, now);
            Integer newNum = (cservice.findCourseById(cId).getCurrentSelectNum())+1;
            cservice.addOne(cId, newNum);
            return "redirect:/admin_home/enrolment";
        }
        else return "Admin/messageCourseFull";
    }

    @GetMapping("/deleteEnrolment/{id}")
    public String DeleteEnrolment(@PathVariable(name="id")Integer id, Model model){
        Student student = asservice.get(id);
        List<Course> enrolledCourses = eservice.findEnrolledCourseById(id);
        model.addAttribute("enrolledCourses", enrolledCourses);
        model.addAttribute("student", student);
        return "Admin/studentEnrolledCourse";
    }

    @GetMapping("/deleteEnrolment2/{studentId}/{courseId}")
    public String Delete(@PathVariable(name = "studentId") Integer sId, @PathVariable(name= "courseId") Integer cId, Model model){
        Student student = asservice.get(sId);
        eservice.cancelEnrolment(sId, cId);
        Integer newNum = (cservice.findCourseById(cId).getCurrentSelectNum())-1;
        cservice.minusOne(cId,newNum);
        List<Course> enrolledCourses = eservice.findEnrolledCourseById(sId);
        model.addAttribute("enrolledCourses", enrolledCourses);
        model.addAttribute("student", student);
        return "Admin/studentEnrolledCourse";

    }
}
