package com.prowings.treeSet;

import java.util.TreeSet;

public class TreeSetDemoComparatorTest {

	public static void main(String[] args) {
		
		Employee emp1= new Employee(10, "Raj");
		Employee emp2= new Employee(11, "Prabhu");
		Employee emp3= new Employee(10, "Sham");
		
		TreeSet t=new TreeSet<>();
		
		t.add(emp3);
		t.add(emp1);
		t.add(emp2);
		
		System.out.println(t);
		
		
		
		
		
		
	}
}
