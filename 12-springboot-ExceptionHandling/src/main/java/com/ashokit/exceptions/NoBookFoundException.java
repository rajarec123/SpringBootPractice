package com.ashokit.exceptions;


public class NoBookFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -928471538716198975L;

	public NoBookFoundException(String msg) {
		super(msg);
	}
}
