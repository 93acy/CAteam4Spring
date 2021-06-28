package sg.edu.iss.CA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CA.model.Course;
import sg.edu.iss.CA.model.Enrollment;
import sg.edu.iss.CA.repository.CourseRepository;
import sg.edu.iss.CA.repository.EnrollmentRepository;

@Service
@Transactional
public class EnrollmentImplementation implements EnrollmentService {
	
	@Autowired
	private EnrollmentRepository er;
	
	@Autowired
	private CourseRepository cr;
	
	public List<Enrollment> findEnrollmentById(String Id){
		return er.findEnrollmentById(Id);
	}
	
	public List<Course> findCourseNotEnroll(String Id){
		List<String> unattendedCoursesIds = er.findCourseNotEnroll(Id);
		List<Course> unattendedCourses = new ArrayList<>();
		for(String unattendedCoursesId : unattendedCoursesIds) {
			Course course = cr.findCourseById(unattendedCoursesId);
			unattendedCourses.add(course);
		}
		return unattendedCourses;
		
	}
	
	public void enrollCourse(String studentId, String courseId) {
		er.enrollCourse(studentId,courseId);
	}

}
