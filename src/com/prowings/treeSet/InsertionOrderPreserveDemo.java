package com.prowings.treeSet;

import java.util.TreeSet;

public class InsertionOrderPreserveDemo {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<>(new MyComparator());
		
		t.add(1);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(2);
		t.add(6);
		t.add(6);
		t.add(6);
		t.add(7);
		
		System.out.println(t);
		
		
		
		
		
	}
}
