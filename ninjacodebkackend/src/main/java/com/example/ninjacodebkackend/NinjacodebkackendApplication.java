package com.example.ninjacodebkackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NinjacodebkackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjacodebkackendApplication.class, args);
	}

}
