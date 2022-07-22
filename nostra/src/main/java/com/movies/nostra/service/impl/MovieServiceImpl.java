package com.movies.nostra.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.nostra.model.Movie;
import com.movies.nostra.repository.MovieRepository;
import com.movies.nostra.service.MovieService;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public Collection<Movie> findAll() {
		return movieRepository.findAll();
	}
	
	public Optional<Movie> findOne(Long id) {
		return movieRepository.findById(id);
	}
	
	public void create(Movie movie) {
		movieRepository.save(movie);
	}
	
	public void update(Movie movie) {
		movieRepository.save(movie);
	}
	
	public void delete(Long id) {
		movieRepository.deleteById(id);
	}

	@Override
	public void update(Long id, Movie movie) {
		movieRepository.save(movie);
	}

}
