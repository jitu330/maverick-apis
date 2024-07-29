package com.bankofapi.maverick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApisApplication.class, args);
	}

	@Bean
	DemoRepository repository() {
		DemoRepository repository = new DemoRepository();
		repository.add(new Fundraiser(1, "Fundraiser for ABC", "Fundraiser for ABC", 5000, 4800));
		repository.add(new Fundraiser(2, "Fundraiser for XYZ", "Fundraiser for XYZ", 10000, 12000));
		repository.add(new Fundraiser(3, "Fundraiser for 123", "Fundraiser for 123", 2500, 2000));

		return repository;
	}

}
