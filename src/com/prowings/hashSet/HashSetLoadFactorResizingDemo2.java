package com.prowings.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetLoadFactorResizingDemo2  {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet<>();
		
		for(char i='a';i<'a'+14;i++)
		{
			System.out.println(hs.add(i));
		}
		System.out.println();
		System.out.println(hs);
		
		
		
		
		
		
		
		
	}
}
