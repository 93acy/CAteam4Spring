package sg.edu.iss.CA.model;

import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="ALLOCATION")
public class Allocation {
	
	@Id
	//@Column(name="ALLOCATION-ID-N")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@ManyToOne
	//@JoinColumn(name = "LECTURER-ID-N")
	private Lecturer lecturer;
	@ManyToOne
	//@JoinColumn(name = "COURSE-ID-N")
	private Course course;
	
	public Allocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	
	
	

}
