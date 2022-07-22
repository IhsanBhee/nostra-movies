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
import com.movies.nostra.model.User;
import com.movies.nostra.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(NostraPaths.user.findAll)
	public Iterable<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping(NostraPaths.user.findOne)
	public Optional<User> findOne(@PathVariable("id") Long id) {
		return userService.findOne(id);
	}
	
	@PostMapping(NostraPaths.user.base)
	public void create(@RequestBody User user) {
		userService.create(user);
	}
	
	@PutMapping(NostraPaths.user.update)
	public void update(@PathVariable("id") Long id, @RequestBody User user) {
		userService.update(id, user);
	}
	
	@DeleteMapping(NostraPaths.user.delete)
	public void delete(@PathVariable("id") Long id) {
		userService.delete(id);
	}
	
}
