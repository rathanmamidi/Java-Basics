package com.basics.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<Integer>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        marks.add(60);
        marks.add(11);
        marks.add(5);

       Iterator<Integer> iterator = marks.iterator();
       while (iterator.hasNext()) {
           Integer m = iterator.next();
           System.out.print(m+" ");
       }

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Streams");

        /*Stream stream = marks.stream();
        stream.forEach(mark -> {
            System.out.println(mark);
        });*/

        // to print elements
        marks.stream().forEach(mark -> {
            System.out.print(mark+ " ");
        });
        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sorting");


        // sort the elements
        marks.stream().sorted().collect(Collectors.toList()).stream().forEach(s-> System.out.print(s+ " "));
        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sorting descending order");


        // sorting descending order
        marks.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList()).stream().forEach(s-> System.out.print(s+" "));

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("adding extra 5 marks to each one");
        // adding 5 marks for all elements
        marks.stream().map(mark -> mark+5).collect(Collectors.toList()).stream().forEach(mark -> System.out.print(mark+ " "));

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Using method reference: read about static and instance method reference");
        // method reference
        marks.stream().forEach(System.out::println);

        List<List<Integer>> list = new ArrayList<>();
        List testMarks = new ArrayList();
        testMarks.add(11);
        testMarks.add(12);

        List testMarks_2 = new ArrayList();
        testMarks_2.add(21);
        testMarks_2.add(22);

        List testMarks_3 = new ArrayList();
        testMarks_3.add(31);
        testMarks_3.add(32);

        list.add(testMarks);
        list.add(testMarks_2);
        list.add(testMarks_3);

        //List<Integer> consolidatedMarks =  list.stream().flatMap(mark-> {  mark.get(0);}).collect(Collectors.toList());


    }
}
