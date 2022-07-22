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
import com.movies.nostra.model.Booking;
import com.movies.nostra.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
    private BookingService bookingService;

    @GetMapping(NostraPaths.booking.findAll)
    public Iterable<Booking> fetchAll() {
        return bookingService.findAll();
    }

    @GetMapping(NostraPaths.booking.findOne)
    public Optional<Booking> fetchById(@PathVariable("id") Long id) {
        return bookingService.findOne(id);
    }
    
    @PostMapping(NostraPaths.booking.base)
	public void create(@RequestBody Booking booking) {
		bookingService.create(booking);
	}

    @PutMapping(NostraPaths.booking.update)
    public Booking update(@PathVariable("id") Long id, @RequestBody Booking booking) {
        return bookingService.update(id, booking);
    }
    
    @DeleteMapping(NostraPaths.booking.delete)
	public void delete(@PathVariable("id") Long id) {
		bookingService.delete(id);
	}

}
