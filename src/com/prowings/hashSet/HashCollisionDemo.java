package com.prowings.hashSet;

import java.util.HashSet;

public class HashCollisionDemo {

	public static void main(String[] args) {
		
		String s1="FB";
		String s2="Ea";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println();
		
		HashSet hs=new HashSet<>();
		
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		
		System.out.println(hs);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
