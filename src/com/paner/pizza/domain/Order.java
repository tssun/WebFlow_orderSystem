package com.paner.pizza.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Payment payment;
	private Customer customer;
	private List<Pizza> pizzas;
	
	public Order(){
		pizzas = new ArrayList<Pizza>();
		customer = new Customer();
	}
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	public void addPizza(Pizza pizza){
		pizzas.add(pizza);
	}
	
}
