package com.prowings.treeSet;

import java.util.TreeSet;

public class HeterogeneousObjectInsertion {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new ComparatorForHeterogeneousInsertion());
		
		t.add("hello");
		t.add("Hi");
		t.add(new StringBuffer("Ram"));
		t.add(new StringBuilder("Sham"));
		t.add("XXXX");
		t.add(1);
		
		System.out.println(t);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
