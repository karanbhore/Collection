package com.prowings.generics;

public class TestGenerics {

	public static void main(String[] args) {

		Box<String> b1 = new Box<>();
		b1.setItem("hello");
		System.out.println(b1.getItem());

		Box<Integer> b2 = new Box<>();

		b2.setItem(1234);
		System.out.println(b2.getItem());

		Pair<String, Integer> pair = new Pair<>();

		pair.setKey("aaa");
		pair.setValue(123);

		System.out.println(pair.getKey() + " " + pair.getValue());

	}
}
