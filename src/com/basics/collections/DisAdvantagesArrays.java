package com.basics.collections;

public class DisAdvantagesArrays {
    public static void main(String[] args) {

        String [] strings = new String[10];

        for (int i=0; i<strings.length; i++) {
            strings[i] = "Hyderabad_"+i;
        }

        strings[10] = "Banglore";

        for (String name: strings) {
            System.out.println(name);
        }
    }
}
