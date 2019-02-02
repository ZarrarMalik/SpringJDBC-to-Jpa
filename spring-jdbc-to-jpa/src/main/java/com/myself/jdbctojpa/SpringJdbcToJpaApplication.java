package com.myself.jdbctojpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myself.jdbctojpa.jdbc.PersonJdbcDAO;

@SpringBootApplication
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
	}

}

