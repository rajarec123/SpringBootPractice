package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ashokit.beans.IEngine;

@Component
public class Car {
	
	private IEngine eng;
	
	public Car() {
		System.out.println("Car:: Constructor...!");
	}
	
	@Autowired
	public void setEng (IEngine eng) {
		System.out.println("Car:: setEng() called");
		this.eng = eng;
	}
	public void drive() {
		int status = eng.start();
		if(status==0) 
			System.out.println("Journey Started...!");
	}

}
