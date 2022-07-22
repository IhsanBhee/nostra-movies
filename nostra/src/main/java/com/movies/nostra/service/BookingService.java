package com.movies.nostra.service;

import java.util.Optional;

import com.movies.nostra.model.Booking;

public interface BookingService {
	
	Iterable<Booking> findAll();
	
	Optional<Booking> findOne(Long id);
	
	void create(Booking booking);
	
	Booking update(Long id, Booking booking);
	
	void delete(Long id);

}
