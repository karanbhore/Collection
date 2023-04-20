package com.prowings.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Excercise6 {

	public static void main(String[] args) {

		LinkedList myLinkedlist = new LinkedList<>();

		myLinkedlist.add("AAA");
		myLinkedlist.add("BBB");
		myLinkedlist.add("10");
		myLinkedlist.add("BBB");
		myLinkedlist.add("20");
		myLinkedlist.add("CCC");
		myLinkedlist.add("DDD");

		System.out.println(myLinkedlist.size());

		Iterator itr = myLinkedlist.iterator();

//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		System.out.println();
		ListIterator ltr = myLinkedlist.listIterator(7);
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}
}
