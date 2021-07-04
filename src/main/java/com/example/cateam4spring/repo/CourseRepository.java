package com.example.cateam4spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Enrolment;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findAll();

    @Query("SELECT c.capacity FROM Course c WHERE c.id = :Id")
    Double findCapacityById(@Param("Id") Integer Id);

    @Query("SELECT c.currentSelectNum FROM Course c WHERE c.id = :Id")
    Double findcurrentSelectNumById(@Param("Id") Integer Id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE course SET current_select_num = :newNum WHERE course_id = :Id", nativeQuery=true)
    void addOne(@Param("Id") Integer Id, @Param("newNum") Integer newNum);

    Course findCourseById(Integer Id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE course SET current_select_num = :newNum WHERE course_id = :Id", nativeQuery=true)
    void minusOne (Integer Id,Integer newNum);
    
    @Query("SELECT c FROM Course c WHERE "
            + "CONCAT(c.name,c.id)"
            + "LIKE %:keyword%")
    List<Course> findByKeyword(@Param("keyword") String keyword);
    
    @Query("select c from Course c join c.lecturers l "
    		+ "where l.id =:lid")
    List<Course> findCourseByLecturerId( @Param("lid") Integer lid);


}
