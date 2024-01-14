package com.example.stockportfolio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {
    @Test
    public void testStockCreation() {
        Stock stock = new Stock("AAPL", "Apple Inc.", 150.50);

        assertEquals("AAPL", stock.getTicker(), "Ticker should be AAPL");
        assertEquals("Apple Inc.", stock.getName(), "Name should be Apple Inc.");
        assertEquals(150.50, stock.getPrice(), 0.01, "Price should be 150.50");
    }
}
