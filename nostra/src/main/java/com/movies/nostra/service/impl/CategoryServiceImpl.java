package com.movies.nostra.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.nostra.model.Category;
import com.movies.nostra.repository.CategoryRepository;
import com.movies.nostra.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Collection<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Optional<Category> findOne(Long id) {
		return categoryRepository.findById(id);
	}
	
	public void create(Category category) {
		categoryRepository.save(category);
	}
	
	public void update(Long id, Category category) {
		categoryRepository.save(category);
	}
	
	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}

}
