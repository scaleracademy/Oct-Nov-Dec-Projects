package com.scaler.pcbuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.Inherited;

@SpringBootApplication()
public class PcBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcBuilderApplication.class, args);
	}

}
