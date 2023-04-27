package com.prowings.hashSet;

import java.util.HashSet;
import java.util.Objects;

public class Employee {

	int id;
	String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public boolean equals(Object obj) {
		boolean res = false;

		if (this == obj) {
			return res = true;
		}
		if (obj == null)
			return res = false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && this.name.equals(other.name);
	}

	public int hashCode() {
		return (this.id + this.name.hashCode()) * 31;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "ram");
		Employee emp2 = new Employee(10, "sham");
		Employee emp3 = new Employee(10, "ram");

		HashSet hs = new HashSet<>();
		System.out.println(hs.add(emp3));
		System.out.println(hs.add(emp2));
		System.out.println(hs.add(emp1));

		System.out.println();
		System.out.println(hs);
		StringBuilder sb=new StringBuilder();
sb.append("hello");
System.out.println(sb);
StringBuffer sbb=new StringBuffer(sb);
System.out.println(sbb);
	}
}
