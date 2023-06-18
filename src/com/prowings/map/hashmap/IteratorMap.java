package com.prowings.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, null);
		hm.put("b", 1);
		hm.put("c", 2);
		hm.put("d", 3);
		hm.put("e", 4);
		hm.put("f", 5);

//		System.out.println(hm);

//		System.out.println(hm.keySet());
		Set set = hm.keySet();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + "+++");
		}

//		System.out.println(hm.values());
		Collection c = hm.values();
		Iterator itr2 = c.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

//		System.out.println(hm.entrySet());
		Set set2 = hm.entrySet();
		Iterator itr3 = set2.iterator();
		while (itr3.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) itr3.next();
			System.out.println(entry);

			if (entry.getKey() == "b") {
				System.out.println(entry.getValue());
			}

		}

	}
}
