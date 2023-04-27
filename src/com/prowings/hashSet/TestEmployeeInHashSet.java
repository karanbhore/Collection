package com.prowings.hashSet;

import java.util.HashSet;

public class TestEmployeeInHashSet {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(10, "ram");
		Employee emp2=new Employee(10, "sham");
		Employee emp3=new Employee(10, "ram");
		
		HashSet hs=new HashSet<>();
		System.out.println(hs.add(emp3));
		System.out.println(hs.add(emp2));
		System.out.println(hs.add(emp1));
		
		System.out.println();
		System.out.println(hs);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
