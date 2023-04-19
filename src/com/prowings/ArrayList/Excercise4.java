package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise4 {

	public static void main(String[] args) {
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("green");
		colors.add("white");
		colors.add("black");
		
		System.out.println(colors);
		
		System.out.println(colors.contains("red"));

//		Collections.sort(colors);
//		System.out.println(colors);
//		System.out.println();
//		

		List num=new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
//		Collections.copy(num, colors);
//		
//		System.out.println(colors);
//		System.out.println(num);
//		
		Collections.shuffle(num);
		System.out.println(num);
		
		Collections.shuffle(colors);
		System.out.println(colors);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
