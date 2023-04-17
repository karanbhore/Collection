package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList4 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("hello");
		
		Object[] myArr=al.toArray();
		
		System.out.println(Arrays.toString(myArr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
