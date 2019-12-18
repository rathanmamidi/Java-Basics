package com.basics.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();

        strings.add("Hyderabad");
        strings.add("Banglore");
        strings.add("Kolkata");
        strings.add("Kolkata");

        //System.out.println( strings.get(2));
        strings.forEach(System.out::println);
    }
}
