package com.towshif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.towshif.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService service ; 
		
	@RequestMapping("/")
	public String welcome () { 
		return service.rootService(); 
	}
	
}
