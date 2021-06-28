package sg.edu.iss.CA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CA.model.Course;

public interface CourseRepository extends JpaRepository<Course, String>{
	
	public List<Course> findAll();
	
	@Query("SELECT c.capacity FROM Course c WHERE c.id = :Id")
	public Double findCapacityById(@Param("Id") String Id);
	
	@Query("SELECT c.currentSelectNum FROM Course c WHERE c.id = :Id")
	public Double findcurrentSelectNumById(@Param("Id") String Id);
		
	@Modifying
	@Transactional
	@Query(value = "UPDATE course SET current_select_num = :newNum WHERE id = :Id", nativeQuery=true)
	public void addOne(@Param("Id") String Id, @Param("newNum") Integer newNum);
	
	public Course findCourseById(String Id);


}
