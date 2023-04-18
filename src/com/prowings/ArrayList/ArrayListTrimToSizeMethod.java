package com.prowings.ArrayList;

import java.util.ArrayList;

public class ArrayListTrimToSizeMethod {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("hello");
		al.add("hello");
		al.add("hello");
		al.add("hello");
		al.add("hello");
		
		System.out.println("size :"+al.size());
		
		System.out.println(al);
		
		al.trimToSize();
		
		
		
		
		
	}
}
