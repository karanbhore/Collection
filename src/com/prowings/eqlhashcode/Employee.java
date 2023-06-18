package com.prowings.eqlhashcode;

import java.util.Objects;

public class Employee {

	int id;
	String name;
	String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

//	public int hashCode() {
//		return Objects.hash(id, name, address);
//	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;

		Employee obj = (Employee) o;

		return Objects.equals(address, obj.address) && id == obj.id && Objects.equals(name, obj.name);

	}

	public String toString() {
		return "Employee [id= " + id + " name=" + name + ",address=" + address + "]";
	}
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(10,"Ram","Pune");
		Employee emp2=emp1;
		Employee emp3=new Employee(10,"Ram","Pune");
		
		System.out.println(emp1==emp2);
		System.out.println(emp1==emp3);
		
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
	}

}
