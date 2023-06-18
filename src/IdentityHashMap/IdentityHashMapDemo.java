package IdentityHashMap;

import java.util.HashMap;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		Car c1=new Car(1234, "c1");
		Car c2=new Car(7, "c2");
		Car c3=new Car(998, "c3");
		Car c4=new Car(7, "c2");
		Car c5=c3;
		
		HashMap<Car,Integer> map=new HashMap<>();
		
		map.put(c1, 11111);
		map.put(c2, 22222);
		map.put(c4, 44444);
		map.put(c3, 33333);
		map.put(c5, 33333);
		
		Set<Map.Entry<Car, Integer>>set =map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=========");
		
		IdentityHashMap<Car,Integer> iMap=new IdentityHashMap<>();
		iMap.put(c1, 1111111);
		iMap.put(c2, 2222222);
		iMap.put(c4, 44444444);
		iMap.put(c3, 3333333);
		iMap.put(c5, 5555555);
		
		Set<Map.Entry<Car, Integer>>set2 =iMap.entrySet();
		Iterator itr2=set2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		
		
		
		
	}
}
