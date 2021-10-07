package com.company;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.junit.jupiter.api.Test
    void setPrice() {
        Trade trade = new Trade("T1", "APPL", 100, 15.25);
        double expected = -45.00;
        trade.setPrice(expected);

        assertEquals(expected , trade.getPrice());
    }
}