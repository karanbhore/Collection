package com.prowings.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

//		System.out.println("initial capacity : " + getCapacity(list));

		list.add("AAA");
		list.add("BBB");
		list.add(null);
		list.add("AAA");
//		System.out.println("capacity after adding elements: " + getCapacity());

		System.out.println(list);

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.add("zzz");
//			itr.remove();
		}

		System.out.println();

		ListIterator<String> ltr = list.listIterator();

		while (ltr.hasNext()) {
			System.out.println(ltr.next());
			list.add("zzz");
//			ltr.remove();
		}

	}
	
//	public static int getCapacity(CopyOnWriteArrayList<String> list) throws Exception {
//        Field dataField = CopyOnWriteArrayList.class.getDeclaredField("array");
//        dataField.setAccessible(true);
//        return ((Object[]) dataField.get(list)).length;
//    }
	
	
	
	
	
	
	
	
	
}
