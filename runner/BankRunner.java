package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Bank;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Bank bank = () -> {
            return "Keerthi";
        };
        String ref = bank.accountHolder();
        System.out.println("Account holder name is: "+ref);
        System.out.println("Main ended");
    }
}
