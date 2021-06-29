package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Role;
import com.example.cateam4spring.model.User;

import java.util.ArrayList;

public interface UserService {

    ArrayList<User> findAllUsers();

    User findUser(String userid);

    User createUser(User user);

    ArrayList<Role> findRolesforUser(String userId);





}
