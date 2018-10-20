package com.brandon.jitneyrestservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brandon.jitneyrestservice.model.BookingRequest;

public interface BookingRequestRepository extends MongoRepository<BookingRequest, Long> {
	
}

