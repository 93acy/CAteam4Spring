package com.example.cateam4spring.service;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cateam4spring.model.Enrolment;
import com.example.cateam4spring.repo.EnrolmentRepository;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository sr;
	
	@Autowired
	private EnrolmentRepository er;

	/*public boolean Authenticate(Student student) {
		Student studentDB = sr.findStudentByIdAndPassword(student.getId(), student.getPassword());
		if (studentDB != null)
			return true;
		else
			return false;
	};*/

	public Student findStudentById(Integer id) {
		return sr.findStudentById(id);
	}
	
	public Double findGpaById(Integer id) {
		return sr.findGpaById(id);
	}

	public Double calculateGPA(Integer id) {

        List<Enrolment> enrolments = er.findEnrolmentsByStudentId(id);
        Double denominator = 0.0;
        Double numerator = 0.0;
        for(Enrolment enrolment : enrolments) {
            numerator += enrolment.getCourse().getCredit() * enrolment.getPoint();
            denominator += enrolment.getCourse().getCredit();
        }

        Double GPA = (numerator/denominator);

        DecimalFormat df =new DecimalFormat("##.00");

        GPA = Double.parseDouble(df.format(GPA));

        sr.updateGPA(id,GPA);
        return GPA;
    }

	@Override
	public List<Student> findByKeyword(String keyword) {
		return sr.findByKeyword(keyword);
	}

	@Override
	public List<Student> findAllStudents() {
		return sr.findAll();
	}

//	public void updateGpa(Double gpa, Integer id) {
//		sr.updateGpa( gpa,id);
//	}; fw

}
