package com.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine implements IEngine {
	public DieselEngine() {
		System.out.println("DieselEngine:: Constructor");
	}

	@Override
	public int start() {
		System.out.println("DieselEngine start() called");
		return 0;
	} 
}
