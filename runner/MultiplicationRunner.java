package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Multiplication;

public class MultiplicationRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Multiplication multiple = (a,b) ->{
            return a*b;
        };
        double ref = multiple.multiply(6.7,8.4);
        System.out.println(ref);
        System.out.println("Main ended");
    }
}
