package com.prowings.map.treemap;

public class Bike {

	int model;
	String company;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int model, String company) {
		super();
		this.model = model;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", company=" + company + "]";
	}
	
	
}
