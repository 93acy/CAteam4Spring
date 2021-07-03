package com.example.cateam4spring.service;

import java.util.List;

import com.example.cateam4spring.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.repo.LecturerRepository;

@Service
public class AdminLecturerServiceImpl implements AdminLecturerService {
	@Autowired
	private UserRepository urepo;

	@Autowired
	private LecturerRepository lrepo;

	@Override
	public List<Lecturer> listAll() {
		return lrepo.findAll();
	}

	@Override
	public void save(Lecturer lecturer) {
		lrepo.save(lecturer);
	}

	@Override
	public Lecturer get(Integer id) {
		return lrepo.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		lrepo.deleteById(id);
	}

}
