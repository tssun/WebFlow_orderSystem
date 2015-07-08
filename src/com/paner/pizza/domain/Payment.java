package com.paner.pizza.domain;

import java.io.Serializable;

public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String finished;


	public String getFinished() {
		return finished;
	}


	public void setFinished(String finished) {
		this.finished = finished;
	}

	
	
}
