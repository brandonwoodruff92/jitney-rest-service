package com.brandon.jitneyrestservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brandon.jitneyrestservice.model.BookingRequest;
import com.brandon.jitneyrestservice.repository.BookingRequestRepository;

public class BookingRequestService implements IBookingRequestService {
	
	@Autowired
	private BookingRequestRepository bookingRequestRepository;
	
	public void setBookingRequestRepository(BookingRequestRepository bookingRequestRepository) {
		this.bookingRequestRepository = bookingRequestRepository;
	}

	@Override
	public List<BookingRequest> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingRequest findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingRequest update(BookingRequest bookingRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingRequest add(BookingRequest bookingRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}
}
