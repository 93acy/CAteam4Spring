package sg.edu.iss.CA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import sg.edu.iss.CA.model.Student;
import sg.edu.iss.CA.repository.StudentRepository;

@Service
@Transactional
public class StudentImplementation implements StudentService{
	
	@Autowired
	private StudentRepository sr;
	
	public boolean Authenticate(Student student) {
		Student studentDB = sr.findStudentByIdAndPassword(student.getId(), student.getPassword());
		if (studentDB != null)
			return true;
		else
			return false;
	};
	
	public Student findStudentById(String id) {
		return sr.findStudentById(id);
	}
		

}
