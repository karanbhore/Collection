package com.prowings.map.treemap;

import java.util.Comparator;

public class StringDecendingComparator implements Comparator<String> {

	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);

	}

}
