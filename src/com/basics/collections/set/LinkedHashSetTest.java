package com.basics.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> hs = new LinkedHashSet<>();
        hs.add("Hyderabad");
        hs.add("Banglore");
        hs.add("Kolakata");
        System.out.println(hs.size());

        hs.add("Hyderabad");
        System.out.println(hs.size());


        /*Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        hs.stream().forEach(System.out::println);

    }
}
