package com.prowings.generics;

public class Demo2<T> {

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public static void main(String[] args) {
		Demo2 obj = new Demo2<>();

		obj.setItem(123);
		System.out.println(obj.getItem());

		obj.setItem("hello");
		System.out.println(obj.getItem());

	}

}
