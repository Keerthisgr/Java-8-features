package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Addition;

public class AdditionRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Addition adding = (i, j) -> {
            return i+j;
        };
       int total = adding.add(23,56);
        System.out.println(total);
        System.out.println("Main ended");
    }
}
