package com.forgyan.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forgyan.entity.Student;
import com.forgyan.service.StudentRegistrationService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRegistrationService service;
	
	@GetMapping("/student")
	public List<Student> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student findById(@PathVariable("id") int id) {
		return service.findById(id);
	}
	
	@PostMapping("/student")
	public Student save(@RequestBody Student entity) {
		return service.save(entity);
	}
	
	@PutMapping("/student")
	public Student update(@RequestBody Student entity) {
		return service.update(entity);
	}

	@DeleteMapping("/student")
	public void delete(@RequestBody Student entity) {
		service.delete(entity);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteById(@PathVariable("id") int id) {
		 service.deleteById(id);
	}


}
