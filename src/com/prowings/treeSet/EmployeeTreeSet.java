package com.prowings.treeSet;

import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1, "Ram");
		Employee emp4=new Employee(15, "Sunda");
		Employee emp2=new Employee(19, "A");
		Employee emp3=new Employee(5, "A");
		Employee emp5=new Employee(5, "Z");
		
		EmployeeNameComparator obj=new EmployeeNameComparator();
		
		TreeSet t=new TreeSet<>(obj);
		
		t.add(emp3);
		t.add(emp1);
		t.add(emp4);
		t.add(emp2);
		t.add(emp5);
		
		System.out.println(t);
		
		EmployeeIdComparator obj2=new EmployeeIdComparator();
		
		TreeSet t1=new TreeSet<>(obj2);
		t1.add(emp3);
		t1.add(emp1);
		t1.add(emp4);
		t1.add(emp2);
		t1.add(emp5);
		
		System.out.println();
		System.out.println(t1);
		
		
	}
}
