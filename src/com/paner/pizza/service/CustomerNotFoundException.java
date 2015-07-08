package com.paner.pizza.service;

public class CustomerNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3421090062135589030L;
	
	public CustomerNotFoundException(String message)
	{
		super(message);
	}

}
