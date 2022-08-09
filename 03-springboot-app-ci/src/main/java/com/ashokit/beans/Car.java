package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private IEngine eng;
		
	@Autowired
	public Car(IEngine eng) {
		System.out.println("Car:: Constructor");
		this.eng = eng;
	}
	public void drive() {
		int status = eng.start();
		if(status==0)
		System.out.println("Journey started...!");	
		else 
			System.out.println("Engine failed to start");
	}
}