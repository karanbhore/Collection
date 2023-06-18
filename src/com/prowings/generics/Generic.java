package com.prowings.generics;

public class Generic<T> {

	T obj;

	public Generic(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public static void main(String[] args) {
		Generic<Integer> o1 = new Generic<Integer>(123);
		System.out.println(o1.getObj());

		Generic<String> o2 = new Generic<String>("hello");

		System.out.println(o2.getObj());

	}

}
