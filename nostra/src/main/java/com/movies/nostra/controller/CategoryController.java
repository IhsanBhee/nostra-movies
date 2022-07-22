package com.movies.nostra.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.nostra.common.NostraPaths;
import com.movies.nostra.model.Category;
import com.movies.nostra.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(NostraPaths.category.findAll)
	public Iterable<Category> findAll() {
		return categoryService.findAll();
	}
	
	@GetMapping(NostraPaths.category.findOne)
	public Optional<Category> findOne(@PathVariable("id") Long id) {
		return categoryService.findOne(id);
	}
	
	@PostMapping(NostraPaths.category.base)
	public void create(@RequestBody Category category) {
		categoryService.create(category);
	}
	
	@PutMapping(NostraPaths.category.update)
	public void update(@PathVariable("id") Long id, @RequestBody Category category) {
		categoryService.update(id, category);
	}
	
	@DeleteMapping(NostraPaths.category.delete)
	public void delete(@PathVariable("id") Long id) {
		categoryService.delete(id);
	}
	
}
