package com.prowings.map.treemap;

import java.util.Objects;

public class Car implements Comparable<Car> {

	int model;
	String company;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int model, String company) {
		super();
		this.model = model;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(company, other.company) && model == other.model;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.company.compareTo(o.company);
	}

}
