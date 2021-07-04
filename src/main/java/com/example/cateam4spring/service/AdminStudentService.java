package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.LecturerRepository;
import com.example.cateam4spring.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AdminStudentService
{

    List<Student> listAll();

    void save(Student student);

    Student get(Integer id);

    void delete(Integer id);
    
    public List<Student> findByKeyword(String keyword);

}
