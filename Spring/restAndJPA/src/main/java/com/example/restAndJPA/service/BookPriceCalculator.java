package com.example.restAndJPA.service;

import com.example.restAndJPA.entities.Book;

public class BookPriceCalculator {

    public double calculatePrice( Book book ){
        double price = book.getPrice();
        double iva =  book.getPrice() * 0.16;

        return price + iva;
    }

}
