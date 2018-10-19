package com.brandon.jitneyrestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brandon.jitneyrestservice.constants.RestRoutes;
import com.brandon.jitneyrestservice.model.Booking;
import com.brandon.jitneyrestservice.service.IBookingService;

@RestController
public class BookingController {
	
	@Autowired
	private IBookingService bookingService;
	
	@RequestMapping(value = RestRoutes.BOOKINGS, method = RequestMethod.GET)
	public List<Booking> getBookings() {
		List<Booking> bookings = bookingService.findAll();
		
		return bookings;
	}
	
	@RequestMapping(value = RestRoutes.BOOKING, method = RequestMethod.GET)
	public Booking getBooking(@PathVariable long id) {
		Booking booking = bookingService.findById(id);
		
		return booking;
	}
	
	@RequestMapping(value = RestRoutes.RECEIVE_BOOKING, method = RequestMethod.POST)
	public Booking addBooking(@PathVariable Booking booking) {
		Booking newBooking = bookingService.add(booking);
		return newBooking;
	}
	
	@RequestMapping(value = RestRoutes.RECEIVE_BOOKING, method = RequestMethod.PATCH)
	public Booking updateBooking(@PathVariable Booking booking) {
		Booking updatedBooking = bookingService.update(booking);
		return updatedBooking;
	}
	
	@RequestMapping(value = RestRoutes.BOOKING, method = RequestMethod.DELETE)
	public void deleteBooking(@PathVariable long id) {
		bookingService.remove(id);
	}
}
