package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Hotel dish = () -> {
            return 78;
        };
        int ref = dish.availableDishes();
        System.out.println(ref);
        System.out.println("Main ended");
    }
}
