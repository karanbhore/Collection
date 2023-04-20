package com.prowings.LinkedList;

import java.util.LinkedList;

public class Excercise7 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);

		System.out.println(l);
		l.set(0, 'a');

		System.out.println();
		System.out.println(l);

	}
}
