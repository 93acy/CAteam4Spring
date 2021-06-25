package com.example.cateam4spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@MappedSuperclass
public class User{

    private String userName;
    private String password;
    private RoleType role;

    public User(String userName, String password, RoleType role
    ){
        super();
        this.userName= userName;
        this.password= password;
        this.role=role;
    }

}
