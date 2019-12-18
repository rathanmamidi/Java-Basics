package com.basics.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList();

       int i =0;
       while (i<10){
           list.add("Hyderabad_"+i);
           i++;
       }
        list.add("Banglore");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        list.remove(5);
        list.add(3,"Yahoo");

        list.forEach(System.out::println); // java 8 feature, Method reference, forEach is streams concept
        String address = list.get(9);

        System.out.println("address: "+address);

    }
}
