package Test;

import com.company.Trade;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.junit.jupiter.api.Test
    void setOnlyPositivePrices() {

        Trade trade = new Trade(001 , "AAPL" , 25);
        double actualPrice = trade.setPrice(-1);

        double expectedPrice = 0.0;

        assertEquals(actualPrice , expectedPrice , "To check if prices set are positive");

    }
}