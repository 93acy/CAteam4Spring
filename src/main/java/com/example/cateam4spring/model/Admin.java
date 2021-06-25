package com.example.cateam4spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Admin")
public class Admin extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Admin(String username, String password, boolean enabled) {
		super(username, password, enabled);
		// TODO Auto-generated constructor stub
	}
}
