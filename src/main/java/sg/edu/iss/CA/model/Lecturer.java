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
@Table (name="Lecturer")
public class Lecturer {
	
	@Id
	//@Column(name="LECTURER-ID-N")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	//@Column(name="LECTURER-FIRST-NAME-M")
	private String firstName;
	//@Column(name="LECTURER-LAST-NAME-M")
	private String lastName;
	//@Column(name="USER-USERNAME-M")
	private String username;
	//@Column(name="USER-PASSWORD-M")
	private String password;
	//@Column(name="ROLETYPE-M")
	private String roleType;
	
	@OneToMany(mappedBy="lecturer")
	private List<Allocation> allocations;
	
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	
	
	
	

}
