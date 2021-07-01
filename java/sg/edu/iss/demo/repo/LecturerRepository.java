package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
	
	/*
	 * public List<Lecturer> findAll();
	 * 
	 * @Query("Select l from Lecturer l where l.firstName like :firstName")
	 * List<Lecturer> queryLecturersByFirstName(@Param("firstName") String
	 * firstName);
	 * 
	 * @Query("Select l from Lecturer l where l.lastName like :lastName")
	 * List<Lecturer> queryLecturersByLastName(@Param("lastName") String lastName);
	 */
	
}
