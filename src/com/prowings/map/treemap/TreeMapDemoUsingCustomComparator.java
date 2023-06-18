package com.prowings.map.treemap;

import java.util.TreeMap;

public class TreeMapDemoUsingCustomComparator {

	public static void main(String[] args) {
		
		Bike c1=new Bike(1234,"Honda");
		Bike c2=new Bike(998,"BMW");
		Bike c3=new Bike(007,"Bajaj");
		
		System.out.println("sorting by model :");
		
		TreeMap<Bike,Integer> tmap=new TreeMap<>(new BikeModelComparator());
		
		tmap.put(c3, 11111);
		tmap.put(c2, 33333);
		tmap.put(c3, 4444);
		
		System.out.println(tmap);
		
		TreeMap<Bike,Integer> tmap2=new TreeMap<>(new BikeCompanyComparator());
		System.out.println("sorting by company");
		tmap2.put(c1, 11111);
		tmap2.put(c2, 22222);
		tmap2.put(c3, 44444);
		
		System.out.println(tmap2);
		
		
		
	}
}
