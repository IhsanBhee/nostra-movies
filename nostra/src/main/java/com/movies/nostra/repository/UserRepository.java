package com.movies.nostra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movies.nostra.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
