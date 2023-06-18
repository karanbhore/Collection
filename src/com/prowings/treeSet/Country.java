package com.prowings.treeSet;

import java.util.Objects;
import java.util.TreeSet;

public class Country implements Comparable {

	String name;
	double population;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String name, double population) {
		super();
		this.name = name;
		this.population = population;
	}

	@Override
	public String toString() {
		return "\nCountry [name=" + name + ", population=" + population + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name, population);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Country other = (Country) obj;
//		return Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(population) == Double.doubleToLongBits(other.population);
//	}
	public int hashCode() {
		return (int) (this.population + this.name.hashCode() * 31);
	}

	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		Country other = (Country) o;
		return this.name.equals(other.name);
	}

	@Override
	public int compareTo(Object o) {

		Country other = (Country) o;

		return this.name.compareTo(other.name);

	}

	public static void main(String[] args) {

		Country c1 = new Country("INDIA", 12000000000d);
		Country c2 = new Country("AMERICA", 1200000000d);
		Country c3 = new Country("RUSSIA", 100000000d);

		TreeSet t = new TreeSet<>();
		t.add(c3);
		t.add(c1);
		t.add(c2);

		System.out.println(t);

	}

}
