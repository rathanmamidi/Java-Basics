package com.basics.interfacetest;

public class AadhaarMain {
    public static void main(String[] args) {

        Person aadhaarPerson = new Aadhaar();

        System.out.println(aadhaarPerson.getName());
        System.out.println(aadhaarPerson.getSurname());
        System.out.println(aadhaarPerson.getLastName());
        System.out.println(aadhaarPerson.gender());

        System.out.println(aadhaarPerson.getMemoryAllocated());
    }
}
