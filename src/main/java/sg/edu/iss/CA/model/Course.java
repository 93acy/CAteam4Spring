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
@Table (name="COURSE")
public class Course {
	
	@Id
	//@Column(name="COURSE-ID-N")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	//@Column(name="COURSE-M")
	private String name;
	//@Column(name="COURSE-DESC")
	private String description;
	//@Column(name="COURSE-CAPACITY-N")
	private Integer capacity;
	//@Column(name="COURSE-CREDIT-N")
	private Double credit;
	//@Column(name="COURSE-START-D")
	private String startDate;
	//@Column(name="COURSE-CURRENTSELECTNUMBER-N")
	//@JoinColumn(name="userlastname_fk", referencedColumnName="lastName")
	private Integer currentSelectNum;
	
	@OneToMany(mappedBy="course")
	private List<Allocation> allocations;	
	@OneToMany(mappedBy="course")
	private List<Enrollment> enrollments;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public Double getCredit() {
		return credit;
	}


	public void setCredit(Double credit) {
		this.credit = credit;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public Integer getCurrentSelectNum() {
		return currentSelectNum;
	}


	public void setCurrentSelectNum(Integer currentSelectNum) {
		this.currentSelectNum = currentSelectNum;
	}

	
	
	
	

}
