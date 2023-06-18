package com.prowings.ennumDemo;

enum Values {
	SMALL, MEDIUM, LARGE, EXTRALARGE;

	Values() {
		System.out.println("constructor invoked!!");

	}

	int val = 10;

	public void getVal() {
		System.out.println("inside getVal()");
		System.out.println("val is :" + val);

	}
}

public class EnnumDemo2 {

	public static void main(String[] args) {
		Values pizzaSize = Values.MEDIUM;

		System.out.println(pizzaSize);

		pizzaSize.getVal();
		System.out.println(pizzaSize.val);
	}

}
