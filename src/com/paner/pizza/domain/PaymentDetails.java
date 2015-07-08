package com.paner.pizza.domain;

import java.io.Serializable;

public class PaymentDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PaymentType paymentType;

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
