package com.prowings.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListConstructors {

    public static void main(String[] args) throws Exception {
        // ArrayList with initial capacity of 20
        ArrayList<Object> al = new ArrayList<>(20);

        al.add("hello");
        al.add(20);
        al.add("hello");
        al.add("hi");
        al.add(10);

        System.out.println("Initial capacity: " + getCapacity(al));
        System.out.println("Size: " + al.size());
        System.out.println(al);

        // Create a new ArrayList with the elements of the previous one
        ArrayList<Object> al2 = new ArrayList<>(al);
        System.out.println("al2: " + al2);
        al2.add(122);
        System.out.println("Initial capacity: " + getCapacity(al2));
        System.out.println("Size: " + al2.size());
    }

    public static int getCapacity(ArrayList<?> al) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true); // Make the private field accessible
        return ((Object[]) dataField.get(al)).length;
    }

}