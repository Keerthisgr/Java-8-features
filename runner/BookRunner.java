package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Book;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Book book = () -> {
            return 6789;
        };
        int ref = book.numberOfBooks();
        System.out.println("Number of books are: "+ref);
        System.out.println("Main ended");
    }
}
