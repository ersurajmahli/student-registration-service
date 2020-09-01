package com.forgyan.dao;

import org.springframework.data.repository.CrudRepository;

import com.forgyan.entity.Student;

public interface StudentDAO extends CrudRepository<Student, Integer>{

}
