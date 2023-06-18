package com.prowings.ArrayList;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();

		hm.put("AAA", 123);
		hm.put("CCC", 123);
		hm.put("BBB", 123);
//		hm.put(null, 123);
//		hm.put("DDD", null);

		System.out.println(hm);

	}
}
