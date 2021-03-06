package com.myself.jdbctojpa;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myself.jdbctojpa.entity.Person;
import com.myself.jdbctojpa.jdbc.PersonJdbcDAO;

// @SpringBootApplication
public class SpringJdbcToJpaApplication implements CommandLineRunner{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	
	@Autowired
	PersonJdbcDAO personJdbcDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcToJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", personJdbcDAO.findAll());
		logger.info("User id 10001 -> {}",personJdbcDAO.findById(10001));
		logger.info("Deleting 10002 -> No of Rows Deleted - {}", personJdbcDAO.deleteById(10002));
		logger.info("Inserting 10004 -> {}", 
				personJdbcDAO.insert(new Person(10004, "Tara", "Berlin", new Date())));
		
		logger.info("Update 10003 -> {}", 
				personJdbcDAO.update(new Person(10003, "Pieter", "Utrecht", new Date())));
	
	}

}

