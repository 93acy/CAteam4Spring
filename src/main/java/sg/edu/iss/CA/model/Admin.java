package sg.edu.iss.CA.model;

import javax.persistence.Id;
//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	
	@Id
	//@Column(name="LECTURER-ID-N")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	//@Column(name="USER-USERNAME-M")
	private String username;
	//@Column(name="USER-PASSWORD-M")
	private String password;
	//@Column(name="ROLETYPE-M")
	private String roleType;
	
	public Admin() {
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

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	
	

	
	

}
