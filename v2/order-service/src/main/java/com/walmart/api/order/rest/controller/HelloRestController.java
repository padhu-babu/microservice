package com.walmart.api.order.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello") // This URI is used by client apps to invoke this method
	public String helloRest() {
		return "Welcome to spring REST";
	}

}
