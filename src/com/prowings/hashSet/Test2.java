package com.prowings.hashSet;

//java.lang.reflect.Field;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {

		HashSet hs = new HashSet<>();

		hs.add("red");
		hs.add("red");
		hs.add("maroon");
		hs.add("green");
		hs.add("black");
		hs.add("white");
		hs.add("black");
		hs.add("yellow");
		hs.add("yellow");

		System.out.println(hs);
		System.out.println();

		System.out.println(hs.add("red"));
		System.out.println(hs.add("maroon"));
		System.out.println(hs.add("red"));
		System.out.println();

		Iterator itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		System.out.println(hs.size());
		System.out.println(hs);

//	 Field field = HashSet.class.getDeclaredField("table");
//     field.setAccessible(true);
//     Object[] array = (Object[]) field.get(hs);
//     int capacity = array.length;
//	
//System.out.println(hs.isEmpty());
//	hs.clear();
//	hs.removeAll(hs);
//	System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println();

		HashSet hs2 = new HashSet<>(hs);
		System.out.println(hs2);
		System.out.println(hs == hs2);
		System.out.println(hs.equals(hs2));
		System.out.println(hs.hashCode());
		System.out.println(hs2.hashCode());

		Object hs3 = hs2.clone();
		System.out.println(hs3);
	}
}
