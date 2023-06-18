package com.prowings.ArrayList;

public class Products {

	String pname;
	int pid;
	char pavailability;
	double pprice;
	float prating;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String pname, int pid, char pavailability, double pprice, float prating) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.pavailability = pavailability;
		this.pprice = pprice;
		this.prating = prating;
	}

	@Override
	public String toString() {
		return "Products [pname=" + pname + ", pid=" + pid + ", pavailability=" + pavailability + ", pprice=" + pprice
				+ ", prating=" + prating + "]";
	}

}
