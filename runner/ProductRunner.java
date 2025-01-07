package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Product;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Product prod = () -> {
            return true;
        };
        boolean isAvailable = prod.isAvailable();
        System.out.println("Is product is available: "+isAvailable);
        System.out.println("Main ended");
    }
}
