package com.brandon.jitneyrestservice.service;

import java.util.List;

import com.brandon.jitneyrestservice.model.Booking;

public interface IBookingService {
	public List<Booking> findAll();
	public Booking findById(long id);
	public Booking update(Booking booking);
	public Booking add(Booking booking);
	public void remove(long id);
}
