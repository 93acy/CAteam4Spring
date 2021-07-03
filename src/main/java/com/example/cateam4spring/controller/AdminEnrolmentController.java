package com.example.cateam4spring.controller;

import com.example.cateam4spring.model.*;
import com.example.cateam4spring.service.AdminStudentService;
import com.example.cateam4spring.service.CourseService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.service.AdminEnrolmentLecturerCourseService;
import com.example.cateam4spring.service.CourseService;

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

    @Autowired
    private AdminEnrolmentLecturerCourseService aelcservice;

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

    @GetMapping("/viewCourseEnrolments/{id}") // id is course id
    public String ViewCourseEnrolments(@PathVariable(name="id")Integer id, Model model){
        Course course = cservice.findCourse(id);
        List <Enrolment> enrolledStudents = eservice.findEnrolmentByCourseId(id);
//        List<Student> students = new ArrayList<>();
//        for (Enrolment e : enrolledStudents){
//            students.add(e.getStudent());}
//        model.addAttribute("students", students);
        model.addAttribute("enrolment", enrolledStudents);
        model.addAttribute("course", course);
        return "Admin/course_enrolments";
    }

    @GetMapping("/deleteEnrolment3/{courseId}/{enrolmentId}")
    public String DeleteEnrolmentInCourse(@PathVariable(name ="courseId") Integer cId, @PathVariable(name= "enrolmentId") Integer eId, Model model)
    {
        Course course = cservice.findCourse(cId);
        Student student = eservice.findStudentByEnrolment(eId);
        eservice.cancelEnrolment(student.getId(), cId);
        Integer newNum = (cservice.findCourseById(cId).getCurrentSelectNum())-1;
        cservice.minusOne(cId,newNum);
        List<Enrolment> enrolledStudents = eservice.findEnrolmentByCourseId(cId);
        model.addAttribute("course", course);
        model.addAttribute("enrolments", enrolledStudents);
        return "Admin/course_enrolments";
    }





    @RequestMapping("/edit_lecturersincourse/{cid}")
    public String returnAllLecturers(@PathVariable(name="cid") Integer cid, Model model) {
        Course course = cservice.findCourse(cid);
        List<Lecturer> listLecturersInCourse = aelcservice.findLecturersInCourse(cid);
        List<Lecturer> listLecturersNotInCourse = aelcservice.findLecturersNotInCourse(cid);
        model.addAttribute("course", course);
        model.addAttribute("listLecturersInCourse", listLecturersInCourse);
        model.addAttribute("listLecturersNotInCourse", listLecturersNotInCourse);
        return "Admin/admin_enrolment_editlecturers";
    }

    @RequestMapping("/remove/{cid}/{lid}")
    public String removeLecturerFromCourse(@PathVariable(name="cid") Integer cid,
                                           @PathVariable(name="lid") Integer lid) {
        aelcservice.deleteLecturerInCourse(cid, lid);
        return "redirect:/admin_enrolment/edit_lecturersincourse/{cid}";
    }

    @RequestMapping("/add/{cid}/{lid}")
    public String AddLecturerToCourse(@PathVariable(name="cid") Integer cid,
                                      @PathVariable(name="lid") Integer lid) {
        aelcservice.addLecturerToCourse(lid, cid);
        return "redirect:/admin_enrolment/edit_lecturersincourse/{cid}";
    }
}

