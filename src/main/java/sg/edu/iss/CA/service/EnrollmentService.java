package sg.edu.iss.CA.service;

import java.util.List;

import sg.edu.iss.CA.model.Course;
import sg.edu.iss.CA.model.Enrollment;

public interface EnrollmentService {
	
	public List<Enrollment> findEnrollmentById(String Id);
	
	public List<Course> findCourseNotEnroll(String Id);

	public void enrollCourse(String studentId, String courseId);

}
