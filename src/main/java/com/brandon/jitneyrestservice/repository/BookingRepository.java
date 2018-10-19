package com.brandon.jitneyrestservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brandon.jitneyrestservice.model.Booking;

public interface BookingRepository extends MongoRepository<Booking, Long> {
	
}
