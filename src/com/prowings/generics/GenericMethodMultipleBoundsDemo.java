package com.prowings.generics;

public class GenericMethodMultipleBoundsDemo {

	public static void main(String[] args) {

		getNumbers(123);
	}

	private static <T extends Number & Comparable<T>> void getNumbers(T data) {

		System.out.println("Data is of type : " + data.getClass().getName() + " and value is : " + data);

	}
}
