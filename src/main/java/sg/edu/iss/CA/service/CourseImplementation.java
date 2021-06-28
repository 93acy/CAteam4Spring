package sg.edu.iss.CA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CA.model.Course;
import sg.edu.iss.CA.repository.CourseRepository;

@Service
@Transactional
public class CourseImplementation implements CourseService {

	@Autowired
	private CourseRepository cr;
	
	public List<Course> findAll() {
		return cr.findAll();
	}
		
	public Double findCapacityById(String Id) {
		return cr.findCapacityById(Id);
	}
	
	public Double findcurrentSelectNumById(String Id) {
		return cr.findcurrentSelectNumById(Id);
	}
	
	public Boolean Compare(Double capacity, Double currentSelectNum) {
		return (capacity > currentSelectNum)? true: false;
	}
	
	public void addOne(String Id,Integer newNum) {
		cr.addOne(Id, newNum);
	}
	
	public Course findCourseById(String id) {
		return cr.findCourseById(id);
	}

}
