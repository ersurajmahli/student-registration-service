package com.forgyan.service;

import java.util.List;

public interface RegistrationService<T> {
	
	public List<T> findAll();
	
	public T findById(int id);
	
	public T save(T entity);
	
	public T update(T entity);
	
	public void delete(T entity);
	
	public void deleteById(int id);



}
