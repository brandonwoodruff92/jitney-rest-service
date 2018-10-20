package com.brandon.jitneyrestservice.configuration;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@EnableMongoRepositories(basePackages = "com.brandon.jitneyrestservice.repository")
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	public String getMappingBasePackage() {
		return "com.brandon.hitneyrestservice";
	}
	
	@Override
	public MongoClient mongoClient() {
		return new MongoClient("localhost", 27017);
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return null;
	}

}
