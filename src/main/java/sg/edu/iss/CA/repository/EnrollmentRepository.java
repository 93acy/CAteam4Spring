package sg.edu.iss.CA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CA.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, String>{
	
	@Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrollment e WHERE e.student.id = :Id)")
	public List<String> findCourseNotEnroll(@Param("Id") String Id);
	
	@Query("SELECT e FROM Enrollment e WHERE e.student.id = :Id")
	public List<Enrollment> findEnrollmentById(String Id);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO enrollment (id, student_id, course_id) VALUES (111, :SId, :CId)", nativeQuery=true)
	public void enrollCourse(@Param("SId") String studentId, @Param("CId") String courseId);

}
