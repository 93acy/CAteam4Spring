package com.example.cateam4spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

    @Resource
    @Autowired
    private EnrolmentRepository erepo;
    
    @Resource
    private CourseRepository crepo;


    @Override
    @Transactional
    public ArrayList<Enrolment> findAllEnrolments(){
        ArrayList<Enrolment> e = (ArrayList<Enrolment>) erepo.findAll();
        return e;
    }
    
   @Override
	public List<Enrolment> findEnrolmentsByStudentId(Integer id) {

		return erepo.findEnrolmentsByStudentId(id);
	}
    
	@Override
	public Optional<Enrolment>findEnrolmentById(Integer id) {
    	
		return erepo.findById(id);
	}




//    public List<Course> findCourseNotEnrol(String Id) {
//        List<String> unattendedCoursesIds = erepo.findCourseNotEnrol(Id);
//        List<Course> unattendedCourses = new ArrayList<>();
//        for (String unattendedCoursesId : unattendedCoursesIds) {
//            Course course = crepo.findCourseById(unattendedCoursesId);
//            unattendedCourses.add(course);
//        }
//        return unattendedCourses;
//    }

    @Override
    @Transactional
    public Enrolment createEnrolment(Enrolment e){
        return erepo.saveAndFlush(e);
    }

    @Override
    public void enrolCourse(String studentId, String courseId) {
        erepo.enrolCourse(studentId, courseId);
    }

    @Override
    @Transactional
    public void deleteEnrolment(Enrolment e){
        erepo.delete(e);
    }

	@Override
	public Enrolment updateEnrolment(Enrolment enrolment) {
		return erepo.saveAndFlush(enrolment);
	}

	@Override
	public void updateGrade(Double grade, Integer id) {
		// TODO Auto-generated method stub
		erepo.updateGrade(grade, id);
	}






	

}
