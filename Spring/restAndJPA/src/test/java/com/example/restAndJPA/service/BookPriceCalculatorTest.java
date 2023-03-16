package com.example.restAndJPA.service;

import com.example.restAndJPA.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest { //This doesn't require spring because BookPriceCalculator isn't a bean, is only for learning basic test purposes

    @Test
    void calculatePrice() {

        //Create the necesarry objects to run the test
        Book book = new Book(null,
                "Test book",
                "Test author",
                100,
                400.0,
                LocalDate.of(2020,02,02),
                false);
        BookPriceCalculator calculator = new BookPriceCalculator();

        //Run the  behaviour to test
        double price = calculator.calculatePrice( book );

        //Corraborate behaviour
        assertTrue( price > 0 );
    }
}