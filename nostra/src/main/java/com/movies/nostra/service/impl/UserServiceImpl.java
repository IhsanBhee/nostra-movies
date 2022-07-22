package com.movies.nostra.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.nostra.model.User;
import com.movies.nostra.repository.UserRepository;
import com.movies.nostra.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Collection<User> findAll() {
		return userRepository.findAll();
	}
	
	public Optional<User> findOne(Long id) {
		return userRepository.findById(id);
	}
	
	public void create(User user) {
		userRepository.save(user);
	}
	
	public void update(Long id, User user) {
		userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

}
