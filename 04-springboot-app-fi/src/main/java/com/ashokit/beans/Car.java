package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier("de")
	private IEngine eng;
	
	public void drive() {
		int status = eng.start();
		if(status==0)
			System.out.println("Journey Started..!");
	}
}