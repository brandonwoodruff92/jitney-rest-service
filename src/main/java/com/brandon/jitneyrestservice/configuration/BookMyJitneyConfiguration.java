package com.brandon.jitneyrestservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.brandon.jitneyrestservice.service.BookingRequestService;
import com.brandon.jitneyrestservice.service.BookingService;
import com.brandon.jitneyrestservice.service.IBookingRequestService;
import com.brandon.jitneyrestservice.service.IBookingService;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.brandon.jitneyrestservice")
public class BookMyJitneyConfiguration {

	@Bean
	public IBookingService bookingService() {
		return new BookingService();
	}
	
	@Bean
	public IBookingRequestService bookingRequestService() {
		return new BookingRequestService();
	}
}
