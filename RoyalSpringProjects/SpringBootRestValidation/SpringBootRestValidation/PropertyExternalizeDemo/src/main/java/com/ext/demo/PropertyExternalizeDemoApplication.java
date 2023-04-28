package com.ext.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PropertyExternalizeDemoApplication {

	public static void main(String[] args) {
		
		args= new String[]{"--spring.config.location=file:d:/properties/application.properties"};
		SpringApplication.run(PropertyExternalizeDemoApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(PropertyExternalizeDemoApplication.class);
	}
}
