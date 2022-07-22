package com.movies.nostra.service;

import java.util.Optional;

import com.movies.nostra.model.Category;

public interface CategoryService {
	
	Iterable<Category> findAll();
	
	Optional<Category> findOne(Long id);
	
	void create(Category category);
	
	void update(Long id, Category category);
	
	void delete(Long id);

}
