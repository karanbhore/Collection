package com.prowings.map.WeakHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import IdentityHashMap.Car;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		
		Car c1=new Car(1234,"c1");
		Car c2=new Car(007,"c2");
		Car c3=new Car(998,"c3");
		
		WeakHashMap<Car,Integer> wmap=new WeakHashMap<>();
//		HashMap<Car, Integer> wmap = new HashMap<>();
		
		wmap.put(c3, 1111111);
		wmap.put(c2, 1111111);
		wmap.put(c1, 1111111);
		
		System.out.println("before GC : ");
		Set<Map.Entry<Car, Integer>>set =wmap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		c1=null;
		
		System.gc();
		
		System.out.println("after Gc : ");
		Set<Map.Entry<Car, Integer>>set2 =wmap.entrySet();
		Iterator itr2=set2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
