package com.basics.collections.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> hs = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        hs.add("Hyderabad");
        hs.add("Banglore"); // Banglore, Hyderabad
        hs.add("Kolakata"); // Banglore, Hyderabad, Kolakata

        /*Iterator itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        hs.stream().forEach(System.out::println);
        //
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Hyderabad");
        hashSet.add("Banglore");
        hashSet.add("Kolakata");
        System.out.println("1111 **************");
        hashSet.stream().forEach(System.out::println);
        System.out.println("2222 **************");

       // hashSet.stream().map((s1, s2)-> s1.compareTo(s2)).collect(Collectors.toCollection()).forEach(System.out::println);
        // hashSet.stream().map(s).
        hashSet.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
