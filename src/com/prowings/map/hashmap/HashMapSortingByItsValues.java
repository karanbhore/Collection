package com.prowings.map.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapSortingByItsValues {

	public static void main(String[] args) {


		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("Cherry", 01);
		hashMap.put("banana", 2);
		hashMap.put("apple", 4);
		hashMap.put("date", 3);
		System.out.println(hashMap);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
		System.out.println(list);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());

			}
		});
		LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> entry : list) {
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(sortedHashMap);
//
//		for (Map.Entry<String, Integer> entry : sortedHashMap.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

	}
}