package com.hello.app;



import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class HelloApplication implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(HelloApplication.class);
	private DataSource dataSource;

	public HelloApplication(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("DataSource" + dataSource.toString());
		JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("select 1");
	}

}
