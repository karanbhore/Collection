package com.prowings.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList3 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("hello");
        al.add(20);
        al.add("hi");
        al.add(40);
        al.add("hi");
        al.add("hello");

        Iterator itr = al.iterator();
        System.out.println(itr.next());

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
            if (element.equals(20))
                al.set(2, "hellloooo");
        }
        System.out.println(al);
    }
}
