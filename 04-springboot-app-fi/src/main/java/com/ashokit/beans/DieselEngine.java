package com.ashokit.beans;

import org.springframework.stereotype.Component;

@Component("de")
//@Primary
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DE:: Constructor");
	}
	
	public int start() {
		System.out.println("Strat() called");
		return 0;
	}	
}