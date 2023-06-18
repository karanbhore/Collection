package com.prowings.map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class FindKeyByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> mymap = new HashMap<>();

		mymap.put("AAA", 123);
		mymap.put("AAA", 456);
		mymap.put("BBB", 999);
		mymap.put("CCC", 333);
		mymap.put("DDD", 567);

		System.out.println("find key by specified value : ");
System.out.println(mymap);
		Integer value = 981;

		String key = getKey(mymap, value);

		System.out.println("key is : " + key);

	}

	private static String getKey(HashMap<String, Integer> mymap, Integer value) {

		Set<String> keySet = mymap.keySet();

		Integer val = null;

		for (String k : keySet) {
			val = mymap.get(k);
			if (val.equals(value))
				return k;
		}
		return null;

	}

}
