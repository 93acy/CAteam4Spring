package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
