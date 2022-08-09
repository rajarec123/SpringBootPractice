package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.util.Car;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:: Constructor");
	}
	@Bean
	public Car instantiateCar() {
		Car c = new Car();
		//Custom Logic
		return c;
	}
}
