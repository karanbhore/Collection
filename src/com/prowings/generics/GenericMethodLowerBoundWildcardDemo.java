package com.prowings.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethodLowerBoundWildcardDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
		display(list1);

//		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
//		display(list2);

		List<Number> list3 = Arrays.asList(4.1, 4.2, 6.1);
		display(list3);

	}
	private static void display(List<? super Integer> list) {
		System.out.println(list);
	}
}
