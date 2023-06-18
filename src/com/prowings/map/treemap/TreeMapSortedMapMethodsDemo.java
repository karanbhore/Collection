package com.prowings.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortedMapMethodsDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();

		tmap.put(10, "AAA");
		tmap.put(50, "EEE");
		tmap.put(40, "DDD");
		tmap.put(20, "BBB");
		tmap.put(30, "CCC");

		System.out.println(tmap);

		Comparator cmp = tmap.comparator();

		System.out.println(cmp);

		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());

		Map<Integer, String> headMap = tmap.headMap(50);
		System.out.println(headMap);

		Map<Integer, String> tailMap = tmap.tailMap(30);
		System.out.println(tailMap);

		Map<Integer, String> subMap = tmap.subMap(30, 50);
		System.out.println(subMap);

	}

}
