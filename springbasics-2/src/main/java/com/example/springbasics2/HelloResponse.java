package com.example.springbasics2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloResponse{

	public HelloResponse(String greeting, String salutation) {
		this.greeting = greeting;
		this.salutation = salutation;
	}

	@JsonProperty("greeting")
	private String greeting;

	@JsonProperty("salutation")
	private String salutation;

	public String getGreeting(){
		return greeting;
	}

	public String getSalutation(){
		return salutation;
	}
}