package com.prowings.hashSet;
import java.lang.reflect.Field;
import java.util.HashSet;

public class HashSetCapacityExample {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>(10);
        set.add("apple");
        set.add("banana");
        set.add("orange");
        
        // Use reflection to get the capacity of the HashSet
        Field field = HashSet.class.getDeclaredField("table");
        field.setAccessible(true);
        Object[] array = (Object[]) field.get(set);
        int capacity = array.length;
        
        System.out.println("Capacity of HashSet: " + capacity);
    }
}
