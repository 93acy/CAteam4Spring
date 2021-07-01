package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

import java.util.Date;
//import java.util.ArrayList;
import java.util.List;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Integer> {

    //@Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id)")
    //public List<String> findCourseNotEnrol(@Param("Id") String Id);
    //need to include conditions for course status

    //@Query("SELECT e FROM Enrolment e WHERE e.student.id = :Id")
    //public List<Enrolment> findEnrolmentById(String Id);

    //@Modifying
    //@Transactional
    //@Query(value = "INSERT INTO Enrolment (student_id, course_id) VALUES ( :SId, :CId)", nativeQuery=true)
    //public void enrolCourse(@Param("SId") String studentId, @Param("CId") String courseId);
    
    
	@Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id)")
	public List<Integer> findCourseNotEnroll(@Param("Id") Integer Id);
	
	@Query("SELECT e FROM Enrolment e WHERE e.student.id = :Id")
	public List<Enrolment> findEnrollmentById(Integer Id);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO enrolment (course_status,enrolment_date, grade, student_user_id, course_course_id) VALUES (0, :now, NULL, :SId, :CId)", nativeQuery=true)
	//@Query(value = "INSERT INTO enrolment (id, student_id, course_id) VALUES (111, :SId, :CId)", nativeQuery=true)
	public void enrollCourse(@Param("SId") Integer studentId, @Param("CId") Integer courseId, @Param("now") String now);

	@Query("SELECT c FROM Course c WHERE c.id IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id AND grade IS NULL)")
	public List<Course> findEnrolledCourseById(@Param("Id") Integer Id);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM enrolment WHERE student_user_id = :SID AND course_course_id = :CID", nativeQuery=true)
	public void cancelenrollment(@Param("SID") Integer studentId, @Param("CID") Integer courseId);

}