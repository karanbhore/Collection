package com.prowings.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapNavigableMapMethodDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tmap=new TreeMap<>();
		
		tmap.put(10, "AAA");
		tmap.put(50, "EEE");
		tmap.put(40, "DDD");
		tmap.put(20, "BBB");
		tmap.put(30, "CCC");
		
		System.out.println(tmap);
		
		Comparator cmp=tmap.comparator();
		
		System.out.println(cmp);
		
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		
		Map<Integer,String> headMap=tmap.headMap(50);
		System.out.println(headMap);
		
		Map<Integer,String> subMap=tmap.subMap(30, 50);
		System.out.println(subMap);
		
		System.out.println("lowerKey :"+tmap.lowerKey(30));
		System.out.println("lowerentry :"+tmap.lowerEntry(50));
		

		System.out.println("jigherKey :"+tmap.higherKey(30));
		System.out.println("lowerentry :"+tmap.higherEntry(50));
		
		System.out.println("ceiling key :"+tmap.ceilingKey(16));
		System.out.println("ceiling entry:"+tmap.ceilingEntry(34));
		
		
		System.out.println("floor key: "+tmap.floorKey(16));
		System.out.println("floor entry: "+tmap.floorEntry(16));
		
		System.out.println("poll first entry : "+tmap.pollFirstEntry());
		System.out.println("poll first entry : "+tmap.pollLastEntry());
		
		System.out.println("after poll "+tmap);
		
		Set<Integer> decendingKeys=tmap.descendingKeySet();
		System.out.println(decendingKeys);
		
		
		
		
		
		
		
	}
}
