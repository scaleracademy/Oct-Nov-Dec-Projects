package com.scaler.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.scaler.springbasics"})
public class SpringbasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbasicsApplication.class, args);
	}

}
