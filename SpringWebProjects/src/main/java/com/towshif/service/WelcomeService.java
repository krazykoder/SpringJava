package com.towshif.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	
	public String rootService () {
		return "Welcome to this webpage";
	}
}
