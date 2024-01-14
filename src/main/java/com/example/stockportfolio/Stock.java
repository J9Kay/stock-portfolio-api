package com.example.stockportfolio;

public class Stock {
    private String ticker;
    private String name;
    private double price;

    // Constructor
    public Stock(String ticker, String name, double price) {
        this.ticker = ticker;
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
