package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Subtraction;

public class SubtractionRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Subtraction sub = (i,j)->{
            return i-j;
        };
        int ref = sub.subtract(89,42);
        System.out.println(ref);
        System.out.println("Main ended");
    }
}
