package com.prowings.map.treemap;

import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		
		
		TreeMap<String, Integer> tmap = new TreeMap<>(new StringDecendingComparator());
		
		tmap.put("VVV", 123);
		tmap.put("AAA", 345);
		tmap.put("PPP", 678);
		
		System.out.println(tmap);
		
	}}
