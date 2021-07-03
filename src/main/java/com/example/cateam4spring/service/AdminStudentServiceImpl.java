package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Student;
import com.example.cateam4spring.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminStudentServiceImpl implements AdminStudentService{

    @Autowired
    private StudentRepository srepo;

    @Override
    public List<Student> listAll() {
        return srepo.findAll();
    }

    @Override
    public void save(Student student) {
        srepo.save(student);
    }

    @Override
    public Student get(Integer id) {
        return srepo.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        srepo.deleteById(id);
    }
}
