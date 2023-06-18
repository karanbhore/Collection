package com.prowings.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> numbers=new Hashtable<>();
//		Hashtable numbers2=new Hashtable<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
//		numbers.put('a', 4);
		
		System.out.println(numbers.put("ten", 4));
		
		System.out.println(numbers);
		
		System.out.println(numbers.get("one"));
		System.out.println(numbers.get('a'));
		System.out.println(numbers.keySet());
		
		Hashtable hs=(Hashtable) numbers.clone();
		System.out.println(hs);
		System.out.println(hs==numbers);
		System.out.println(hs.equals(numbers));
		System.out.println(hs.hashCode());
		System.out.println(numbers.hashCode());
		hs.clear();
		System.out.println(hs);
		
		hs.putAll(numbers);
		System.out.println(hs);
		System.out.println(hs.remove("ten"));
		System.out.println(hs.get(4));
		
		Enumeration o=hs.elements();
		System.out.println(o);
		
		Hashtable<Character,Integer> ht=new Hashtable(8,0.60f);
//		System.out.println(ht.put("hello", 1));
//		System.out.println(ht.put("hello", 1));
//		System.out.println(ht.put("hello", 2));
//		System.out.println(ht.put("hello", 3));
//		System.out.println(ht.put("hello", 4));
//		System.out.println(ht.put("hello", 5));
//		System.out.println(ht.put("hello", 6));
//		System.out.println(ht.put("hello", 7));
//		System.out.println(ht.put("hello", 8));
//		System.out.println(ht.put("hello", 9));
//		System.out.println(ht.put(null, 1));
		for(int i='a', j=0;i<'a'+9;i++,j++) {
			ht.put((char) i, j);
		}
		System.out.println(ht);
		
	}
	
	
	
	
	
	
	
	
	
}
