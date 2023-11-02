package edu.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestStockMarket {
    @Test
    public static void TestStockmarket(){
        StockMarket market = new StockMarketReal();
        market.add(new Stock(228.0f, "228"));
        assertEquals(new Stock(228.0f, "228"), market.MostValuableStock());
        market.add(new Stock(239.239f, "239"));
        assertEquals(market.sz(), 2);
        market.add(new Stock(30.30f, "30"));
        assertEquals(new Stock(239.239f, "239"), market.MostValuableStock());
        market.remove(new Stock(239.239f, "239"));
        assertEquals(new Stock(228.0f, "228"), market.MostValuableStock());
        market.remove(market.MostValuableStock());
        market.remove(market.MostValuableStock());
        assertEquals(0, market.sz());
    }
    public static void main(String[] args) {
        TestStockmarket();;
    }
}
