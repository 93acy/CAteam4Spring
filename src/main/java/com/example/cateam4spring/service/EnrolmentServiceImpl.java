package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {
//
//    @Resource
//    private EnrolmentRepository erepo;
//    @Resource
//    private CourseRepository crepo;
//
//
//    @Override
//    @Transactional
//    public ArrayList<Enrolment> findAllEnrolments(){
//        ArrayList<Enrolment> e = (ArrayList<Enrolment>) erepo.findAll();
//        return e;
//    }
//
//    @Override
//    @Transactional
//    public ArrayList<Enrolment> findEnrolmentById(String Id){
//        return (ArrayList<Enrolment>) erepo.findEnrolmentById(Id);
//    }


//    public List<Course> findCourseNotEnrol(String Id) {
//        List<String> unattendedCoursesIds = erepo.findCourseNotEnrol(Id);
//        List<Course> unattendedCourses = new ArrayList<>();
//        for (String unattendedCoursesId : unattendedCoursesIds) {
//            Course course = crepo.findCourseById(unattendedCoursesId);
//            unattendedCourses.add(course);
//        }
//        return unattendedCourses;
//    }

//    @Override
//    @Transactional
//    public Enrolment createEnrolment(Enrolment e){
//        return erepo.saveAndFlush(e);
//    }
//
//    @Override
//    public void enrolCourse(String studentId, String courseId) {
//        erepo.enrolCourse(studentId, courseId);
//    }
//
//    @Override
//    @Transactional
//    public void deleteEnrolment(Enrolment e){
//        erepo.delete(e);
//    }
//
}
