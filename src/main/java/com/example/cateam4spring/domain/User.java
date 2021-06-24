package com.example.cateam4spring.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;

public class User {
    @Id
    int ID;

    String password;
    String firstName;
    String lastName;
}
