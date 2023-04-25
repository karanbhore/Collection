package com.prowings.stack;
import java.util.Stack;

public class SortStackDescending {

    public static void sortStackDescending(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int currentElement = stack.pop();
            
            while (!tempStack.isEmpty() && tempStack.peek() < currentElement) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(currentElement);
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(9);
        
        System.out.println("Original stack: " + stack);
        
        sortStackDescending(stack);
        
        System.out.println("Sorted stack (descending order): " + stack);
    }

}
