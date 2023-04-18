package com.prowings.ArrayList;

import java.text.DateFormat.Field;
import java.util.ArrayList;

public class ArrayListEnsureCapacityMethod {

		
		public static void main(String[] args) {
			
			
			ArrayList al = new ArrayList(); //no-arg - creates 10 capacity array
			
			al.add("hello");
			al.add(20);
			al.add("hello");
			al.add("hi");
			al.add(10);
			al.add(30);
			
			
			al.ensureCapacity(20);
			
			try {
				System.out.println("initial capacity : "+getCapacity(al));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("size : "+al.size());

			System.out.println(al);
			
		}

		
	    public static int getCapacity(ArrayList<?> l) throws Exception {
	        java.lang.reflect.Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(l)).length;
	    }
		}
