package com.mbi.devops.integration.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevopsIntegrationSpringbootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationSpringbootApplication.class, args);
	}

}
