package com.basics.interfacetest;

public class Aadhaar implements Person {

    @Override
    public String getName() {
        return getLastName()+" "+getSurname();
    }

    @Override
    public String getSurname() {
        return "Ganji";
    }

    @Override
    public String getLastName() {
        return "Pari";
    }

    @Override
    public String gender() {
        return FEMALE_GENDER;
    }

    public String fetchName() {
        return "Ganji Paripurna FetchName()";
    }
}
