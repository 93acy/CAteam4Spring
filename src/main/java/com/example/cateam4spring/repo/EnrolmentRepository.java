package com.example.cateam4spring.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Integer> {


	@Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id)")
	List<Integer> findCourseNotEnrolled(@Param("Id") Integer Id);

	@Query("SELECT e FROM Enrolment e WHERE e.student.id = :Id AND grade IS NOT NULL")
	List<Enrolment> findEnrolmentsByStudentId(Integer Id);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO enrolment (course_status,enrolment_date, grade, student_user_id, course_course_id) VALUES (0, :now, NULL, :SId, :CId)", nativeQuery=true)
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
    		+ "when e.grade in (90,100) then 'A'"
    		+ "when e.grade in (80,90) then 'B'"
    		+ "when e.grade in (70,80) then 'C'"
    		+ "when e.grade in (60,70) then 'D'"
    		+ "else 'Fail'"
    		+ "end", nativeQuery=true)
    void updateCourseStatus();
    
    
    @Query(value="SELECT e FROM Enrolment e "
            + "LIKE %:keyword%", nativeQuery=true)
    List<Enrolment> findByKeyword(@Param("keyword") String keyword);
    
    


}