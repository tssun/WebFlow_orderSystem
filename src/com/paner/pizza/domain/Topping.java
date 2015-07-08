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
			temp = "·¬ÇÑ½´ ´óËâ Å£ÖÁÒ¶";
			break;
		case Margherita:
			temp="·¬ÇÑ½´ mozzarella Å£ÖÁÒ¶ ¼Ó¼¸Æ¬ÂŞÀÕÒ¶";
			break;
		case Romana:
			temp="·¬ÇÑ½´ mozzarella ·ïÎ²Óã capperi";
			break;
		case Quattro_Stagioni:
			temp="·¬ÇÑ½´ mozzarella Êì»ğÍÈ Ñó¼» ·ïÎ²Óã Å£ÖÁÒ¶";
			break;
		default:
			temp="²»¾ÍÊÇÉÕ±ıÂï";
			break;
		}
		
		return temp;
		
	}
}
