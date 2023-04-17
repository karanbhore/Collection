package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList7 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("world");
		
//		List al2=al.subList(2, 4);
		List al2=new ArrayList(al.subList(2, 4));
		
		System.out.println(al2);
		
		al.set(2, "AAA");
		System.out.println(al);
		System.out.println(al2);
		
		
		
		
		
		
		
	}
}
