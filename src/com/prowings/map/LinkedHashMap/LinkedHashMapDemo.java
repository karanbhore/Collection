package com.prowings.map.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();

		lmap.put("AAA", 123);
		lmap.put("BBB", 456);
		lmap.put("AAA", 456);

		lmap.put(null, 999);

		lmap.put("CCC", 678);

		System.out.println(lmap);
		Set<Map.Entry<String, Integer>> set=lmap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}
}
