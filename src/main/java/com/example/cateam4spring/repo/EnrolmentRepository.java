package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Integer> {


	@Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id)")
	public List<Integer> findCourseNotEnrolled(@Param("Id") Integer Id);

	@Query("SELECT e FROM Enrolment e WHERE e.student.id = :Id")
	public List<Enrolment> findEnrolmentById(Integer Id);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO enrolment (course_status,enrolment_date, grade, student_user_id, course_course_id) VALUES (0, :now, NULL, :SId, :CId)", nativeQuery=true)
	//@Query(value = "INSERT INTO enrolment (id, student_id, course_id) VALUES (111, :SId, :CId)", nativeQuery=true)
	public void enrolCourse(@Param("SId") Integer studentId, @Param("CId") Integer courseId, @Param("now") String now);
	@Query("SELECT c FROM Course c WHERE c.id IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id AND grade IS NULL)")
	public List<Course> findEnrolledCourseById(@Param("Id") Integer Id);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM enrolment WHERE student_user_id = :SID AND course_course_id = :CID", nativeQuery=true)
	public void cancelEnrolment(@Param("SID") Integer studentId, @Param("CID") Integer courseId);

    @Modifying
    @Transactional
    @Query(value = "update Enrolment e set e.grade = :newGrade where e.id = :Eid", nativeQuery=true)
    public void updateGrade(@Param("newGrade") Double newGrade, @Param("Eid") Integer Eid);


}