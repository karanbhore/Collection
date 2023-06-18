package com.prowings.ennumDemo;

enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE;

	Size() {
		System.out.println("constructor invoked!!");
	}
}

public class EnnumDemo {

	public static void main(String[] args) {

//		String to enum constant
		String s = "MEDIUM";
		Size pizzaSize = Size.valueOf(s);
		System.out.println(pizzaSize);
		orderPizza(pizzaSize);

//		Enum constant to String 
		Size sz = Size.EXTRALARGE;
		String size2 = sz.toString();
		System.out.println("ennum constant in String :" + size2);

	}

	private static void orderPizza(Size pizzaSize) {

		switch (pizzaSize) {

		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza ");
			break;
		case EXTRALARGE:
			System.out.println("I ordered a extra large size pizza");
			break;
		default:
			System.out.println("I dont know which one to ordered");
			break;

		}

	}

}
