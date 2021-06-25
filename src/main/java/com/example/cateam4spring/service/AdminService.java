package com.example.cateam4spring.service;

import com.example.cateam4spring.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AdminService {

    protected EntityManager em;

//    public Student editStudent(int id, String userName, String password){
//        Student student =
//    }

    public Student findStudent(int id){
        return em.find(Student.class, id);
    }

    public List<Student> listAllStudent() {
        String q = "SELECT s FROM Student s";

        TypedQuery<Student> query = em.createQuery(q, Student.class);
        return query.getResultList();
    }

//    public List<Student> listStudents(String searchterm) {
//        String q = "SELECT s FROM Student s WHERE s.firstName = :searchterm OR s.lastName = :searchterm OR s.userName  = :searchterm";
//        TypedQuery<Student> query = em.createQuery(q,Student.class).setParameter("searchterm", searchterm);
//        return query.getResultList();

//    }







}
