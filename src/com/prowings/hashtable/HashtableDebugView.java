package com.prowings.hashtable;

import java.util.Hashtable;

public class HashtableDebugView {

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();

		System.out.println(ht.put("A", 123));
		System.out.println(ht.put("B", 123));
		System.out.println(ht.put("C", 123));
		System.out.println(ht.put("D", 123));
		System.out.println(ht.put("E", 123));
		System.out.println(ht.put("R", 123));
		System.out.println(ht.put("F", 123));
		System.out.println(ht.put("G", 123));
		System.out.println(ht.put("H", 123));
		System.out.println(ht.put("I", 123));
		System.out.println(ht.put("J", 123));

		System.out.println(ht);

		System.out.println(ht.size());
		System.out.println(ht.isEmpty());

	}
}
