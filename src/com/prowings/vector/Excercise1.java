package com.prowings.vector;

import java.util.Vector;

public class Excercise1 {

	public static void main(String[] args) {

		Vector v = new Vector<>();

		for (char i = 'A'; i <= 'Z'; i++) {
//			if (i % 2 == 0)
				v.add(i);
		}
		System.out.println(v);

	}
}
