package com.brandon.jitneyrestservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.brandon.jitneyrestservice")
public class BookMyJitneyConfiguration {

}
