package com.mindtree.poc.helloWorld.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.poc.helloWorld.config.ConfigClientAppConfiguration;

import lombok.Data;

@RestController
@Data
@RefreshScope
public class HelloWorldController {
	
	@Autowired
	private ConfigClientAppConfiguration properties;
	
	@Value("${server.instance.name}")
	private String instance;
	
	@Value("${homeMessage}")
	private String homeMessage;
	
	@Value("${greeting.greetings}")
	private String greeting;
	
	@Value("${greeting.name}")
	private String name;
	
	@RequestMapping("/home")
	public String home() {
		return homeMessage+" from "+ instance;
	}
	
	@RequestMapping("/greet")
	public String greet() {
		System.out.println(properties.getUrl());
		return greeting+" "+name + " from "+ instance+"\n url is "+properties.getUrl();
	}
	

}
