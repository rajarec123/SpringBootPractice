package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		// new SpringApplicationBuilder(Application.class)
		//	.bannerMode(Banner.Mode.OFF).run(args);
		
		
	}
}