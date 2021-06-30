package com.example.cateam4spring.repo;

import com.example.cateam4spring.model.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Integer> {

    @Query("SELECT c.id FROM Course c WHERE c.id NOT IN (SELECT e.course.id FROM Enrolment e WHERE e.student.id = :Id)")
    public List<String> findCourseNotEnrol(@Param("Id") String Id);
    //need to include conditions for course status

    @Query("SELECT e FROM Enrolment e WHERE e.student.id = :Id")
    public List<Enrolment> findEnrolmentsByStudentId(@Param("Id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Enrolment (student_id, course_id) VALUES ( :SId, :CId)", nativeQuery=true)
    public void enrolCourse(@Param("SId") String studentId, @Param("CId") String courseId);


    

}