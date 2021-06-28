package sg.edu.iss.CA.service;

import java.util.List;


import sg.edu.iss.CA.model.Course;


public interface CourseService {
	
	public List<Course> findAll();
	public Double findCapacityById(String Id);
	public Double findcurrentSelectNumById(String Id);
	public Boolean Compare(Double capacity, Double currentSelectNum);
	public void addOne(String Id,Integer newNum);
	public Course findCourseById(String id);

}
