package com.prowings.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Demo2 {

 public static void main(String[] args) {
	 Hashtable<String, Integer> ht = new Hashtable<>();

		System.out.println(ht.put("A", 123));
		System.out.println(ht.put("B", 123));
		System.out.println(ht.put("C", 123));
		System.out.println(ht.put("D", 123));
		System.out.println(ht.put("E", 123));
		System.out.println(ht.put("R", 123));
		System.out.println(ht.put("F", 123));
		System.out.println(ht.put("G", 123));
		System.out.println(ht.put("H", 123));
		System.out.println(ht.put("I", 123));
		System.out.println(ht.put("J", 123));

		System.out.println(ht);

	System.out.println(ht.remove("A")); 
	 
	 System.out.println(">>>>>>>><<<<<<<<keys:enumeration");
	 Enumeration emr=ht.keys();
	 
	 while(emr.hasMoreElements())
	 {
		 System.out.println(emr.nextElement());
	 }
	 
	 System.out.println("<<<<<<<<>>>>>>>");
	 
	 Enumeration emr1=ht.elements();
	 
	 while(emr1.hasMoreElements())
	 {
		 System.out.println(emr1.nextElement());
	 }
	 
	 System.out.println(ht);
	 
	 
	 
	 
	 
	 
	 
}
 
	
	
	
	
	
	
	
	
}
