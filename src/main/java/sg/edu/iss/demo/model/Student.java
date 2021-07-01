package sg.edu.iss.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Student{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;	
	private double GPA;
	private Date enrollmentDate;

	public Student(Integer id, String firstName, String lastName, double gPA, Date enrollmentDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
		this.enrollmentDate = enrollmentDate;
	}
}
