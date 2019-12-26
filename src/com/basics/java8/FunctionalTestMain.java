package com.basics.java8;

import java.util.function.Predicate;

public class FunctionalTestMain {

    Predicate<Integer> isVoterEligible = (age) ->  {
        return age > 16 ;
    };

    public static void main(String[] args) {
        FunctionalTestMain obj = new FunctionalTestMain();
        obj.voterEligibleCalculator();
    }

    public void voterEligibleCalculator() {
        System.out.println(isVoterEligible.test(17));
        isVoterEligible.test(25);
    }
}
