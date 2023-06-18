package com.prowings.generics;

public class Demo {

	public static <T> T doSomething(T data) {
		System.out.println(data.getClass());
		return data;
	}

	public static void main(String[] args) {

		System.out.println(doSomething(123));
		System.out.println(doSomething("hello"));
		System.out.println(doSomething(2.5));

	}
}
