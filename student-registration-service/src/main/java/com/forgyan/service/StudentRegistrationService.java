package com.forgyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forgyan.dao.StudentDAO;
import com.forgyan.entity.Student;

@Service
@Transactional
public class StudentRegistrationService implements RegistrationService<Student> {

	@Autowired
	private StudentDAO dao;
	
	@Override
	public List<Student> findAll() {
		return (List<Student>) dao.findAll();
	}

	@Override
	public Student findById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Student save(Student entity) {
		return dao.save(entity);
	}

	@Override
	public Student update(Student entity) {
		return dao.save(entity);
	}

	@Override
	public void delete(Student entity) {
		dao.delete(entity);
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

}
