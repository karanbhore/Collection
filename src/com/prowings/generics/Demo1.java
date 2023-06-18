package com.prowings.generics;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Demo1 <K,V>{
	
	private K key;
	private V value;

	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public <T> T doSomething(T data) {
		System.out.println(data);
		return data;
		
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		
		obj.doSomething(123);
		
		obj.doSomething("hello");
		
		Demo1<String,Integer> obj2=new Demo1<>();
		obj2.setKey("hello");
		System.out.println(obj2.getKey());
		
		
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		display(l);
		
		List<Double> l2=Arrays.asList(1.2,2.2,3.2,4.2,5.2);
		
		
		
		
		
		
		
		
		
	}
	private static void display(List<? super Number> l) {
		// TODO Auto-generated method stub
		System.out.println(l);
	}
}
