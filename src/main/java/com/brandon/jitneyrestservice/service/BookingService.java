package com.brandon.jitneyrestservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandon.jitneyrestservice.model.Booking;
import com.brandon.jitneyrestservice.repository.BookingRepository;

@Service
public class BookingService implements IBookingService {
	
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public List<Booking> findAll() {
		List<Booking> bookings = bookingRepository.findAll();
		
		return bookings;
	}

	@Override
	public Booking findById(long id) {
		Booking booking = bookingRepository.findById(id).orElse(null);
		
		return booking;
	}

	@Override
	public Booking update(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public Booking add(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public void remove(long id) {
		bookingRepository.deleteById(id);
	}
}
