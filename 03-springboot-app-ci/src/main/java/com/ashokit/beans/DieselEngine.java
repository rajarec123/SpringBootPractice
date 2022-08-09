package com.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DE:: Constructor");
	}
		
	public int start() {
		System.out.println("DE:: start() called");
		return 0;
	}
}
