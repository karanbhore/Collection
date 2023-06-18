package com.prowings.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethodUpperBoundWildcardDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
		System.out.println("Total sum is : " + sum(list1));

		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1, 7.1);
		System.out.println("Total sum is : " + sum(list1));

	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
		return sum;
	}
}
