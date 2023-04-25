package com.prowings.stack;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {

		Stack s = new Stack<>();

		for (char i = 'a'; i < 'a' + 10; i++) {
			s.add(i);
		}
		System.out.println(s);

		System.out.println();

		s.push('k');
		System.out.println(s);
		System.out.println();

		System.out.println(s.pop());
		System.out.println(s);
		System.out.println();

		System.out.println(s.peek());
		System.out.println(s);
		System.out.println();

		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println();

		s.trimToSize();
		System.out.println(s.capacity());
		System.out.println();

		Collections.shuffle(s);
		System.out.println(s);
		System.out.println();

//		s.sort((Comparator) s);
		System.out.println(s);

		Stack s1 = new Stack<>();

		for (int i = 0; i < 10; i++) {
			s1.add(i);
		}
		System.out.println(s1);
		Collections.shuffle(s1);
		System.out.println(s1);
	
		Collections.sort(s1);
		System.out.println(s1);

	}
}
