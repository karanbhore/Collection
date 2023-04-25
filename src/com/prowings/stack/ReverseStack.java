package com.prowings.stack;

import java.util.Collections;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {

		Stack stack = new Stack<>();

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		System.out.println("given stack");
		System.out.println(stack);
		System.out.println();

		reverse(stack);
		System.out.println("reversed stack");
		System.out.println(stack);

//		Collections.reverse(stack);
//		System.out.println(stack);

	}

	private static void reverse(Stack stack) {

		if (stack.isEmpty()) {
			return;
		}
		int temp = (int) stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);
	}

	private static void insertAtBottom(Stack stack, int value) {
		if (stack.isEmpty()) {
			stack.push(value);
			return;
		}
		int temp = (int) stack.pop();
		insertAtBottom(stack, value);
		stack.push(temp);

	}
}
