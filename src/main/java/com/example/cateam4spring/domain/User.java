package com.example.cateam4spring.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private RoleType role;
    public User(String userName, String password, RoleType role
    ){

        this.userName= userName;
        this.password= password;
        this.role=role;
    }


    public User(String userName, String password){
        super();
        this.userName= userName;
        this.password= password;
    }



}
