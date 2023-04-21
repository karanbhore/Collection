package com.prowings.vector;

import java.util.Vector;

public class Excercise2 {

	public static void main(String[] args) {
		Vector v = new Vector<>();

		System.out.println(v.capacity());

		v.trimToSize();
		System.out.println(v.capacity());
		System.out.println();

		for (int i = 0; i < 12; i++) {
			v.add(i);
		}
		System.out.println(v);

		System.out.println(v.capacity());

	}
}
