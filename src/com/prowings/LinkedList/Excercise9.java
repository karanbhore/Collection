package com.prowings.LinkedList;

import java.util.LinkedList;

public class Excercise9 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");

		System.out.println(l);

		LinkedList l2 = new LinkedList();

		l2.addAll(l);

		System.out.println(l2);

		System.out.println(l2.equals(l));
		
		System.out.println(l2.containsAll(l));
		System.out.println(l.containsAll(l2));
		System.out.println(l.contains("a"));
		System.out.println(l.contains(1));
		
		
		
		

	}
}
