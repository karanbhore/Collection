package com.prowings.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Excercise1 {
	
	
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
		
		System.out.println(myLinkedlist);
		
		Iterator itr = myLinkedlist.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}