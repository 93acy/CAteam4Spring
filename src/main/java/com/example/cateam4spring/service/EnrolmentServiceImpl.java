package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
//import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.CourseRepository;
import com.example.cateam4spring.repo.EnrolmentRepository;

//import com.example.cateam4spring.model.Enrolment;
//import com.example.cateam4spring.repo.EnrolmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnrolmentServiceImpl implements EnrolmentService {


    @Autowired
    private EnrolmentRepository erepo;

    @Autowired
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

    public List<Course> findCourseNotEnrolled(Integer Id){
        List<Integer> unattendedCoursesIds = erepo.findCourseNotEnrolled(Id);
        List<Course> unattendedCourses = new ArrayList<>();
        for(Integer unattendedCoursesId : unattendedCoursesIds) {
            Course course = crepo.findCourseById(unattendedCoursesId);
            unattendedCourses.add(course);
        }
        return unattendedCourses;

    }

    public void enrolCourse(Integer studentId, Integer courseId, String now) {
        erepo.enrolCourse(studentId,courseId, now);
    }

    public List<Course> findEnrolledCourseById(Integer Id){
        return erepo.findEnrolledCourseById(Id);
    }

    public void cancelEnrolment(Integer studentId, Integer courseId) {
        erepo.cancelEnrolment(studentId, courseId);
    }

    @Override
    @Transactional
    public Enrolment createEnrolment(Enrolment e){
        return erepo.saveAndFlush(e);
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
	public Enrolment findEnrolmentById(Integer id) {
		return erepo.findById(id).get();
	}


	@Override
	public void updateGrade(Double newGrade, Integer id) {
		erepo.updateGrade(newGrade, id);
		
	}


	@Override
	public void updateCourseStatus() {
		erepo.updateCourseStatus();
		
	}



	@Override
	public List<Enrolment> findByKeyword(String keyword) {
		
		return erepo.findByKeyword(keyword);
	}

}
