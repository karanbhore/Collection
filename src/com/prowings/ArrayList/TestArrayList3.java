package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("hello");

		Iterator itr = al.iterator();
		System.out.println(itr.next());

//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			if (itr.next().equals(10))
//				al.set(0, "hellloooo");
//
//		}
//			System.out.println(al);
//
		}
	}

