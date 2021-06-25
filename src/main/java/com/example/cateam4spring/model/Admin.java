package com.example.cateam4spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Table(name="Admin")
public class Admin extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Admin(String userName, String password, RoleType Role){
        super(userName, password, Role);

    }

}
