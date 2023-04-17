package com.prowings.ArrayList;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");
        al.add("how");
        al.add("are");
        al.add("you");
        al.add("doing");
        al.add("5");
        al.add("80");
        al.add("190");
        al.add("101");
        al.add("104");
        al.add("10");
        al.add("10");

        int capacity = getCapacity(al);
        System.out.println("Capacity: " + capacity);
    }

    public static <E> int getCapacity(ArrayList<E> l) {
        int oldCapacity = l.size();
        l.ensureCapacity(oldCapacity + 1);
        return ((Object[]) l.toArray()).length;
    }
}
