package com.prowings.ArrayList;

import java.util.ArrayList;

import com.prowings.ArrayList.CustomArrayListExample.Product;

public class CustomArrayListEx2 {

	int size = 6;

	class Product {
		String pname;
		double pprice;
		char pavailability;
		float prating;
		int pid;

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(String pname, double pprice, char pavailability, float prating, int pid) {
			this.pname = pname;
			this.pprice = pprice;
			this.pavailability = pavailability;
			this.prating = prating;
			this.pid = pid;
		}
	}

	public static void main(String[] args) {

		int[] pid = { 1, 2, 3, 4, 5, 6 };
		String[] pname = { "HP Laptop","iPhone11","invertors", "Panasonic TV", "BOSH wanshingMachine", "BAJAJ Fridge" };
		double[] pprice = { 100000d, 70000d, 60000d, 40000d, 30000d,50000d };
		char[] pavailability = { 'Y', 'N', 'Y', 'N', 'Y', 'Y' };
		float[] prating = { 4.5f, 4.5f, 5f, 5f, 7f, 7f };

		CustomArrayListEx2 obj = new CustomArrayListEx2();
		obj.addElements(pname, pprice, pavailability, prating, pid);

	}

	private void addElements(String[] pname, double[] pprice, char[] pavailability, float[] prating, int[] pid) {

		ArrayList<Product> arrayList = new ArrayList<>();

		for (int i = 0; i < size; i++) {

			arrayList.add(new Product(pname[i], pprice[i], pavailability[i], prating[i], pid[i]));

		}
		diplayElements(arrayList);

	}

	private void diplayElements(ArrayList<Product> arrayList) {

		System.out.println("Product Name     " + "Product Price     " + "Product Availability     " + "Product Rating     "
				+ "Product Rating     ");

		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>><<<<<<");

		for (int i = 0; i < size; i++) {
			Product product = arrayList.get(i);
			System.out.println(product.pname+"     " + "    " + product.pprice+"    " + "          " + product.pavailability+"    "+"    "+ "    "
					+ product.prating +"    "+ "    " +  product.pid);

		}

	}

}
