package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList6 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("hello");

		ListIterator ltr = al.listIterator(6);

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			al.add("dd");
		}

	}
}
