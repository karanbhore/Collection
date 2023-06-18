package com.prowings.map.treemap;

import java.util.Comparator;

public class BikeCompanyComparator implements Comparator<Bike>{

	@Override
	public int compare(Bike o1, Bike o2) {
		return o1.company.compareTo(o2.company);
	}
	
	

	
}
