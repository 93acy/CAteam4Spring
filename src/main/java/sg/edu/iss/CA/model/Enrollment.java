package sg.edu.iss.CA.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ENROLLMENT")
public class Enrollment {
	
	@Id
	//@Column(name="ENROLLMENT-ID-N")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	//@Column(name="COURSE-STATUS-M")
	private String status;
	//@Column(name="ENROLLMENT-DATE")
	private String date;
	//@Column(name="GRADE-N")
	private Double grade;
	
	@ManyToOne
	//@JoinColumn(name = "STUDENT-ID-N")
	private Student student;
	
	@ManyToOne
	//@JoinColumn(name = "COURSE-ID-N")
	private Course course;

	
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Double getGrade() {
		return grade;
	}


	public void setGrade(Double grade) {
		this.grade = grade;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}

	

	
	
	

}
