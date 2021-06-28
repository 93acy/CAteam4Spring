package sg.edu.iss.CA.service;

import sg.edu.iss.CA.model.Student;


public interface StudentService {
	
	public boolean Authenticate(Student Student);
	public Student findStudentById(String id);


}
