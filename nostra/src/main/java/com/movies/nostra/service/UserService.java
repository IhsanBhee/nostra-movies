package com.movies.nostra.service;

import java.util.Optional;

import com.movies.nostra.model.User;

public interface UserService {
	
	Iterable<User> findAll();
	
	Optional<User> findOne(Long id);
	
	void create(User user);
	
	void update(Long id, User user);
	
	void delete(Long id);

}
