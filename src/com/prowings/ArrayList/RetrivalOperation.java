package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RetrivalOperation {

	public static void main(String[] args) {
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("green");
		colors.add("white");
		colors.add("black");
		
		System.out.println(colors);
		
		String elelment=colors.get(0);
		System.out.println("firstElement :"+elelment);
		
		String element=colors.get(2);
		System.out.println(element);
		System.out.println("secondElement :"+element);
		
		
		
		
		
		
		
		
		
	}
}
