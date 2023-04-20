package com.prowings.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Excercise3 {

	public static void main(String[] args) {

		ArrayList mylist = new ArrayList<>();
		mylist.add("AAA");
		mylist.add("BBB");
		mylist.add("10");
		mylist.add("BBB");
		mylist.add("20");
		mylist.add("CCC");

		LinkedList myLinkedList = new LinkedList();

		myLinkedList.addAll(mylist);

		System.out.println(mylist.size());

		System.out.println(mylist);
		System.out.println();
		System.out.println(mylist);

	}
}
