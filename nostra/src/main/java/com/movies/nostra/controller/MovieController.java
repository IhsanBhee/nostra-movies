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
import com.movies.nostra.model.Movie;
import com.movies.nostra.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(NostraPaths.movie.findAll)
	public Iterable<Movie> findAll() {
		return movieService.findAll();
	}
	
	@GetMapping(NostraPaths.movie.findOne)
	public Optional<Movie> findOne(@PathVariable("id") Long id) {
		return movieService.findOne(id);
	}
	
	@PostMapping(NostraPaths.movie.base)
	public void create(@RequestBody Movie movie) {
		movieService.create(movie);
	}
	
	@PutMapping(NostraPaths.movie.update)
	public void update(@PathVariable("id") Long id, @RequestBody Movie movie) {
		movieService.update(id, movie);
	}
	
	@DeleteMapping(NostraPaths.movie.delete)
	public void delete(@PathVariable("id") Long id) {
		movieService.delete(id);
	}
	
}
