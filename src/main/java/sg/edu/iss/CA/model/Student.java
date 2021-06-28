package sg.edu.iss.CA.model;

import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Student")
public class Student {
	
	@Id
	//@Column(name="STUDENT-ID-N")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	//@Column(name="USER-USERNAME-M")
	private String username;
	//@Column(name="STUDENT-PASSWORD-M")
	private String password;
	//@Column(name="STUDENT-FIRST-NAME-M")
	private String firstName;
	//@Column(name="STUDENT-LAST-NAME-N")	
	private String lastName;
	//@Column(name="STUDENT-ENROLLMENT-DATE-D")
	private String enrollmentDate;
	//@Column(name="GPA-N")
	private Double gpa;
	//@Column(name="ROLETYPE-M")
	private String roleType;


	@OneToMany(mappedBy="student")
	private List<Enrollment> enrollments;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	
	
}
