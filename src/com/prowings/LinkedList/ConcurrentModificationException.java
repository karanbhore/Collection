package com.prowings.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConcurrentModificationException {

	public static void main(String[] args) {

		List l = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		l.add("a");
		System.out.println(l);
		System.out.println();

		ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
//			l.set(0, 15);
			if (itr.next() == "a") {
				itr.remove();
			}

//			l.add(5);
//			System.out.println(itr.next());
		}
System.out.println(l);
	}
}
