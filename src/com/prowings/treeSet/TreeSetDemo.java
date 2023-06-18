package com.prowings.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet<>(new MyComparator1());


		t.add("hello");
		t.add("hello");
		t.add("Preeti");
		t.add("Sham");
		t.add("Ram");
		t.add("hi");
		t.add(1);
		
		
		
		int p=5;
		
		
		
		
		System.out.println(t);

	}

}
