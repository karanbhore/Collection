package com.prowing.enummap;

import java.util.EnumMap;
import java.util.Iterator;

enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE;

	Size() {
		System.out.println("enum constructor invoked!!");
	}
}

public class EnumMapDemo {

	public static void main(String[] args) {

		EnumMap<Size, Integer> mymap = new EnumMap<>(Size.class);

		mymap.put(Size.EXTRALARGE, 80);
		mymap.put(Size.LARGE, 60);
		mymap.put(Size.SMALL, 40);
		mymap.put(Size.MEDIUM, 50);
		mymap.put(Size.SMALL, 100);
		mymap.put(Size.SMALL, null);
//		mymap.put(null,100);

		System.out.println(mymap);

		Iterator<Size> itr = mymap.keySet().iterator();
		while (itr.hasNext()) {
			Size k = itr.next();
			System.out.println("key : " + k + " and " + "Value : " + mymap.get(k));
		}

	}

}
