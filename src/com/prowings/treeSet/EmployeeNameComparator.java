package com.prowings.treeSet;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {

		Employee emp1 = (Employee) obj1;
		Employee emp2 = (Employee) obj2;
		int res = emp1.name.compareTo(emp2.name);
		return -res;

	}

}
