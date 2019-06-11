package com.mindtree.poc.helloWorld.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix="datasource")
@Data
public class ConfigClientAppConfiguration {
	private String url;
}
