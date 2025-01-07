package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.RedBus;

public class TravellingRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        RedBus srs = () -> {
            return 15;
        };
        RedBus vrl = () -> {
            return 20;
        };
        System.out.println("SRS Seate: "+srs.minBooking());
        System.out.println("VRL Seats: "+vrl.minBooking());
        System.out.println("Main ended");

    }
}
