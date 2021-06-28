package sg.edu.iss.CA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.CA.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, String> {

}
