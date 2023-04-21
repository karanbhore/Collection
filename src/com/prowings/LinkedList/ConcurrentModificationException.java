package com.prowings.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {

		List l = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		System.out.println();
		l.add(10);
		l.remove(5);
		Iterator itr = l.listIterator();
		while (itr.hasNext()) {
			l.set(0, 15);

			System.out.println(itr.next());
		}

	}
}
