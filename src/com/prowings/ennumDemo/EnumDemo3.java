package com.prowings.ennumDemo;

enum PizzaSize implements I {
	SMALL, MEDIUM, LARGE, EXTRALARGE;

	PizzaSize() {
		System.out.println("construcor invoked!!");
	}

	int val = 10;

	public void getVal() {
		System.out.println("inside get val()");
		System.out.println("val is : " + val);
	}

	public void m1() {
		System.out.println("inside m1()");
	}

}

public class EnumDemo3 {
	public static void main(String[] args) {

		Values pizzaSize = Values.SMALL;

		System.out.println(pizzaSize);

		pizzaSize.getVal();

		System.out.println(pizzaSize.val);
		System.out.println(pizzaSize.ordinal());
		

	}

}
