package edu.hw3;

import java.util.PriorityQueue;

public class StockMarketReal implements StockMarket{
    PriorityQueue<Stock> pq = new PriorityQueue<Stock>(new MyComparator()); 
    public void add(Stock stock){
        pq.add(stock);
    }
    public void remove(Stock stock){
        pq.remove(stock);
    }
    public Stock MostValuableStock(){
        return pq.peek();
    }
    public int sz(){
        return this.pq.size();
    }
}
