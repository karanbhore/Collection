package com.prowings.generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer i = 120;
		Long l = 123l;
		Float f = 123.3f;
		Number n = 23;
		Object o = 234;
		String s = "dfg";

		getData("hello");
		getNumbers(123);

		getNumbers(n);
		getNumbers(i);
		getNumbers(f);
		getNumbers(l);
//		getNumbers(o);
//		getNumbers(s);

	}

	public static <T> void getData(T data) {
		System.out.println("Daat is of type : " + data.getClass().getName() + " and value is :" + data);
	}

	public static <T extends Number> void getNumbers(T data) {
		System.out.println("Data is of type : " + data.getClass().getName());
	}

}
