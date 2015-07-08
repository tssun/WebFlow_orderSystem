package com.paner.pizza.domain;

import java.io.Serializable;

public class Pizza implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String size;
	private Topping topping;
	
	public boolean addPizza(Pizza pizza){
		return true;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Topping getTopping() {
		return topping;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	
	
}
