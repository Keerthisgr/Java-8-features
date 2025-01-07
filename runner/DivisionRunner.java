package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Division;

public class DivisionRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Division div = (a,b) -> {
            return a/b;
        };
        double ref = div.division(7.8,2.4);
        System.out.println(ref);
        System.out.println("Main ended");
    }
}
