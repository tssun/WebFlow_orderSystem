package com.paner.pizza.domain;


import java.util.Arrays;
import java.util.List;

public enum PaymentType {

	CASH,CHECK,CREDIT_CARD;
	
	public static List<PaymentType> asList(){
		PaymentType[]  all = PaymentType.values();
		System.out.println("size:"+all.length);
		return Arrays.asList(all);
	}
	
	@Override
	public String toString(){
		if (this == CASH) {
			return "现金";
		}else if(this == CHECK)
			return "支票";
		else {
			return "信用卡";
		}
	}
}
