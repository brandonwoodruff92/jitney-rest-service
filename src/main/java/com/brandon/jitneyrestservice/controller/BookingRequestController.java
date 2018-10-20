package com.brandon.jitneyrestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brandon.jitneyrestservice.constants.RestRoutes;
import com.brandon.jitneyrestservice.model.BookingRequest;
import com.brandon.jitneyrestservice.service.IBookingRequestService;

@RestController
public class BookingRequestController {
	
	@Autowired
	private IBookingRequestService bookingRequestService;
	
	@RequestMapping(value = RestRoutes.BOOKING_REQUESTS, method = RequestMethod.GET)
	public List<BookingRequest> getBookingRequests() {
		List<BookingRequest> bookingRequests = bookingRequestService.findAll();
		
		return bookingRequests;
	}
	
	@RequestMapping(value = RestRoutes.BOOKING_REQUEST, method = RequestMethod.GET)
	public BookingRequest getBookingRequest(@PathVariable long id) {
		BookingRequest bookingRequest = bookingRequestService.findById(id);
		
		return bookingRequest;
	}
	
	@RequestMapping(value = RestRoutes.RECEIVE_BOOKING_REQUEST, method = RequestMethod.POST)
	public BookingRequest addBookingRequest(@PathVariable BookingRequest bookingRequest) {
		BookingRequest newBookingRequest = bookingRequestService.add(bookingRequest);
		
		return newBookingRequest;
	}
	
	@RequestMapping(value = RestRoutes.RECEIVE_BOOKING_REQUEST, method = RequestMethod.POST)
	public BookingRequest updateBookingRequest(@PathVariable BookingRequest bookingRequest) {
		BookingRequest updatedBookingRequest = bookingRequestService.update(bookingRequest);
		
		return updatedBookingRequest;
	}
}
