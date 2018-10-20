package com.brandon.jitneyrestservice.service;

import java.util.List;

import com.brandon.jitneyrestservice.model.BookingRequest;

public interface IBookingRequestService {
	public List<BookingRequest> findAll();
	public BookingRequest findById(long id);
	public BookingRequest update(BookingRequest bookingRequest);
	public BookingRequest add(BookingRequest bookingRequest);
	public void remove(long id);
}
