package com.servicosmsc.finansys.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.servicosmsc.finansys.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instatiateDatabase() throws Exception {
		
		dbService.instantiateTestDatabase();
		
		return true;
	}

}