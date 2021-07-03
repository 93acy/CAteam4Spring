package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.model.Student;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Integer> {


	@Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id)")
	List<Integer> findCourseNotEnrolled(@Param("Id") Integer Id);

	@Query("SELECT e FROM Enrolment e WHERE e.student.id = :Id AND grade IS NOT NULL")
	List<Enrolment> findEnrolmentsByStudentId(Integer Id);

	@Query("SELECT e from Enrolment e WHERE e.course.id=:Id")
	List<Enrolment> findEnrolmentByCourseId(@Param("Id")Integer Id);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO enrolment (course_status,enrolment_date, grade, student_user_id, course_course_id) VALUES ('Ongoing', :now, NULL, :SId, :CId)", nativeQuery=true)
	//@Query(value = "INSERT INTO enrolment (id, student_id, course_id) VALUES (111, :SId, :CId)", nativeQuery=true)
	void enrolCourse(@Param("SId") Integer studentId, @Param("CId") Integer courseId, @Param("now") String now);

	@Query("SELECT c FROM Course c WHERE c.id IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id AND grade IS NULL)")
	List<Course> findEnrolledCourseById(@Param("Id") Integer Id);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM enrolment WHERE student_user_id = :SID AND course_course_id = :CID", nativeQuery=true)
	void cancelEnrolment(@Param("SID") Integer studentId, @Param("CID") Integer courseId);

    @Modifying
    @Transactional
    @Query(value = "update Enrolment e set e.grade = :newGrade where e.id = :id", nativeQuery=true)
    void updateGrade(@RequestParam Double newGrade, @Param("id") Integer Id );


    @Modifying
    @Transactional
    @Query(value = "update Enrolment e "
    		+ "set e.course_status = case "
    		+ "when e.grade between 90 and 100 then 'A'"
    		+ "when e.grade between 80 and 90 then'B'"
    		+ "when e.grade between 70 and 80 then 'C'"
    		+ "when e.grade between 60 and 70 then 'D'"
    		+ "else 'F'"
    		+ "end", nativeQuery=true)
    void updateCourseStatus();


    @Query(value="SELECT * FROM Enrolment e, Student s, Course c "
    		+ "WHERE e.student_user_id = s.user_id AND e.course_course_id = c.course_id AND "
    		+ "CONCAT(name, first_name,last_name,user_id)"
            + "LIKE %:keyword%", nativeQuery=true)
    List<Enrolment> findByKeyword(@Param("keyword") String keyword);


	@Query("SELECT e.student FROM Enrolment e WHERE e.id = :eId")
	public Student findStudentByEnrolment(@Param("eId") Integer eId);
}
