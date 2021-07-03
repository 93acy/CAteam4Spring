package com.example.cateam4spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.cateam4spring.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
	
	@Query("SELECT l FROM Lecturer l JOIN l.courses c WHERE c.id = :id")
	public List<Lecturer> findLecturersInCourse(@Param("id") Integer id);
	
	@Query("SELECT l FROM Lecturer l WHERE l.id NOT IN (SELECT l.id FROM Lecturer l JOIN l.courses c WHERE c.id = :id)")
	public List<Lecturer> findLecturersNotInCourse(@Param("id") Integer id);
	
//	@Query("INSERT INTO course_allocation(lecturer_id, course_id) SELECT l.id, c.id FROM Lecturer l FULL JOIN Course c WHERE l.id = :Lid AND c.id = :Cid")
//	public void addLecturerToCourse(@Param("Lid") Integer Lid, @Param("Cid") Integer Cid);
//	
//	@Query("DELETE FROM course_allocation ca WHERE ca.course_id = :Cid AND ca.lecturer_id = :Lid")
//	public void deleteLecturerInCourse(@Param("Cid") Integer Cid, @Param("Lid") Integer Lid);
}
