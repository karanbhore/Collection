package com.prowings.LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionConversion {

	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();

		l.add(1);
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println(l instanceof Iterable);

		ArrayList a = new ArrayList<>();

		a.addAll(l);
		System.out.println(a);
		System.out.println(a instanceof Iterable);

		System.out.println(a.contains(1));
		System.out.println("last element of LinkedList l :" + l.getLast());

//		System.out.println(l.pollLast());
//		System.out.println(l);

//		System.out.println(l.peekLast());

//System.out.println(l.peek());		

//		System.out.println(l.poll());

		LinkedList l2 = new LinkedList<>(l);
		System.out.println(l2);
		System.out.println(l == l2);
		System.out.println(l.equals(l2));

		LinkedList colors = new LinkedList<>(l);

		colors.add("red");
		colors.add("white");
		colors.add("black");
		colors.add("yellow");
		colors.add("green");

//		System.out.println(colors);
//Collections.shuffle(colors);
//System.out.println(colors);

//Collections.swap(colors, 0, 4);		
		System.out.println(colors);

		colors.removeAll(l);

//		colors.clear();

//colors.removeFirst();
//colors.removeLast();
//		System.out.println(colors);
//		colors.remove(2);

		for (int i = 0; i < colors.size(); i++) {
			System.out.println("colors at index " + i + ": " + colors.get(i));
		}

		System.out.println(colors);
		System.out.println();
		
		
		System.out.println(colors.getFirst());
		System.out.println(colors.getLast());
		System.out.println();
		
		colors.add(0, "golden!!!");
		System.out.println(colors);
		
		
colors.addFirst("silver!!");
colors.addLast("maroon!!");
		System.out.println();
//		Iterator itr=colors.descendingIterator();

		Iterator itr=colors.listIterator(2);
		Iterator itr1=colors.iterator();
		
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
System.out.println();		
		colors.add(l2);
		System.out.println(colors);
		
		
		
		
		
		
		

			
		}
		
		
		
		
	}

