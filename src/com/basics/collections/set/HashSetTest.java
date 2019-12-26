package com.basics.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        // insertion order is not preserved
        // it will store the values based on hashing bucket
        HashSet<String> hs = new HashSet<>();
        hs.add("Hyderabad");
        hs.add("Banglore");
        hs.add("Kolakata");

        /*Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        hs.stream().forEach(System.out::println);
    }
}
