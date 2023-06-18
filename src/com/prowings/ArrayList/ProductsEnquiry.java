package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProductsEnquiry {

	static int size = 6;

	public static void main(String[] args) {


		String[] pname = { "Fridge", "WashingMachine", "TV", "Fan", "Cooler", "AC" };
		int[] pid = { 1, 2, 3, 4, 5, 6 };
		char[] pavailability = { 'Y', 'Y', 'Y', 'Y', 'Y', 'Y' };
		double[] pprice = { 20000, 20000, 20000, 5000, 5000, 20000 };
		float[] prating = { 5, 5, 5, 5, 5, 5 };

		ArrayList<Products> productsEnquiry = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			productsEnquiry.add(new Products(pname[i], pid[i], pavailability[i], pprice[i], prating[i]));

		}

		ListIterator<Products> display = productsEnquiry.listIterator();
		while (display.hasNext()) {
			System.out.println(display.next());
		}

	}

}
