package com.mindtree.poc.helloWorld.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	@Value("${homeMessage}")
	private String homeMessage;
	
	@Value("${greeting}")
	private String greeting;
	
	@Value("${name}")
	private String name;
	
	@RequestMapping("/home")
	public String home() {
		return homeMessage;
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return greeting+name;
	}
	

}
