package sg.edu.iss.CA.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.CA.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	
	
	public Student findStudentByIdAndPassword(String id, String password);
	
	public Student findStudentById(String id);
	
}
