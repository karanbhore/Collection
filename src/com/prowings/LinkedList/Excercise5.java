package com.prowings.LinkedList;

import java.util.LinkedList;

public class Excercise5 {

	public static void main(String[] args) {

		LinkedList mylist = new LinkedList<>();

		mylist.add("a");
		mylist.add("10");
		mylist.add("b");
		mylist.add(20);
		mylist.add("c");
		mylist.add("a");
		mylist.add("a");

		System.out.println(mylist);
		System.out.println();

		mylist.addFirst("z");
		System.out.println(mylist);
		System.out.println();

		mylist.addLast("m");
		System.out.println(mylist);
		System.out.println();

		mylist.offer("x");
		mylist.offerFirst("q");
		mylist.offerLast("r");
		System.out.println(mylist);
		System.out.println();

		System.out.println(mylist.peek());
		System.out.println(mylist.peekFirst());
		System.out.println(mylist.peekLast());
		System.out.println();

//		System.out.println(mylist.poll());
		System.out.println(mylist.pop());
		System.out.println(mylist);

	}
}
