package com.movies.nostra.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.nostra.model.Booking;
import com.movies.nostra.repository.BookingRepository;
import com.movies.nostra.service.BookingService;

@Service("bookingService")
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public Collection<Booking> findAll() {
		return bookingRepository.findAll();
	}
	
	public Optional<Booking> findOne(Long id) {
		return bookingRepository.findById(id);
	}
	
	public void create(Booking movie) {
		bookingRepository.save(movie);
	}
	
	public void update(Booking movie) {
		bookingRepository.save(movie);
	}
	
	public void delete(Long id) {
		bookingRepository.deleteById(id);
	}

	@Override
	public Booking update(Long id, Booking movie) {
		return bookingRepository.save(movie);
	}

}
