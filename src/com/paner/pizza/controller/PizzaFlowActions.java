package com.paner.pizza.controller;

import java.io.Serializable;

import com.paner.pizza.domain.Customer;
import com.paner.pizza.domain.Order;
import com.paner.pizza.domain.Payment;
import com.paner.pizza.domain.PaymentDetails;
import com.paner.pizza.service.CustomerNotFoundException;

public class PizzaFlowActions implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException{
		
		if (phoneNumber.equalsIgnoreCase("15856915194")) {
			Customer customer = new Customer();
			customer.setName("paner");
			customer.setPhoneNumber("15856915194");
			customer.setAddress("china");
			customer.setCity("�Ͼ�");
			customer.setState("effective");
			customer.setZipCode("211");
			return customer;
		}
		else {
			throw new CustomerNotFoundException("û�ҵ��ÿͻ���Ϣ");
		}
	}

	public Payment verifyPayment(PaymentDetails paymentDetails){
		
		Payment payment = new Payment();
		String temp = (paymentDetails.getPaymentType()).toString();
		payment.setFinished(temp);
		
		return payment;
	}
	
	public void saveOrder(Order order)
	{
		System.out.println("���涩��");
	}
	
	public boolean checkDeliveryArea(String zipCode)
	{
		if (zipCode.compareToIgnoreCase("999999")>0) {
			return false;
		}
		return true;
	}
	
	public void addCustomer(Customer customer)
	{
		System.out.println("���˿���Ϣ���浽���ݿ��У�"+customer.getName());
		
	}

}
