package com.prowings.treeSet;

public class Employee implements Comparable {

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

	public int hashCode() {
		return this.id + this.name.hashCode() * 31;
	}

	public boolean equals(Object obj) {
		boolean res = false;
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (this.id == other.id && this.name.equals(other.name))
			res = true;
		return res;
	}

	@Override
	public int compareTo(Object o) {

		Employee other=(Employee) o;
	if(this.id==other.id)
		return 0;
	else if(this.id>other.id)
		return 1;
	else 
		return -1;
	
	}

}
