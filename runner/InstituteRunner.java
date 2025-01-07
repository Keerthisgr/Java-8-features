package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Institute;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Institute institute = () -> {
            return 56;
        };
        int num = institute.numberOfTrainee();
        System.out.println("number of trainee in an institute: "+num);
        System.out.println("Main ended");
    }
}
