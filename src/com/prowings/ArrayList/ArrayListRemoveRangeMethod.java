package com.prowings.ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveRangeMethod extends ArrayList {

	public static void main(String[] args) {

		ArrayListRemoveRangeMethod lst = new ArrayListRemoveRangeMethod();

		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		lst.add("F");

		System.out.println(lst);
		System.out.println("removing elements");

		lst.removeRange(1, 3);

		System.out.println(lst);

	}
}
