package com.paner.pizza.domain;

import java.util.Arrays;
import java.util.List;

public enum Topping {

	Marinara,Margherita,Romana,Quattro_Stagioni ;
	
   
   public static List<Topping> asList(){
	   Topping[] toppings = Topping.values();
	   return Arrays.asList(toppings);
   }
   
	@Override
	public String toString(){

		String temp = null;
		switch (this) {
		case Marinara:
			temp = "���ѽ� ���� ţ��Ҷ";
			break;
		case Margherita:
			temp="���ѽ� mozzarella ţ��Ҷ �Ӽ�Ƭ����Ҷ";
			break;
		case Romana:
			temp="���ѽ� mozzarella ��β�� capperi";
			break;
		case Quattro_Stagioni:
			temp="���ѽ� mozzarella ����� �� ��β�� ţ��Ҷ";
			break;
		default:
			temp="�������ձ���";
			break;
		}
		
		return temp;
		
	}
}
