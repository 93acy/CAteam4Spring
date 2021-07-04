package com.example.cateam4spring.service;

import java.util.List;

import com.example.cateam4spring.model.Course;
import com.example.cateam4spring.model.Lecturer;

public interface AdminLecturerService {
	public List<Lecturer> listAll();
     
    public void save(Lecturer lecturer);
     
    public Lecturer get(Integer id);
     
    public void delete(Integer id);

    List<Lecturer> lecturerFindByKeyword(String keyword);
    
}
