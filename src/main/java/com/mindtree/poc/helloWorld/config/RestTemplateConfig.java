package com.mindtree.poc.helloWorld.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	
	@Autowired
	RestTemplateBuilder restTemplateBuilder;
	
	@Bean
	public RestTemplate createRestTemplate() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		return restTemplate;
	}

}
