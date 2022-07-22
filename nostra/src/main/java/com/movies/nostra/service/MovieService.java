package com.movies.nostra.service;

import java.util.Optional;

import com.movies.nostra.model.Movie;

public interface MovieService {
	
	Iterable<Movie> findAll();
	
	Optional<Movie> findOne(Long id);
	
	void create(Movie movie);
	
	void update(Long id, Movie movie);
	
	void delete(Long id);

}
