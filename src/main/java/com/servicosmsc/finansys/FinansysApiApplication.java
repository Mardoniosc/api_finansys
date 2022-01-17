package com.servicosmsc.finansys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinansysApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FinansysApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { }

}
