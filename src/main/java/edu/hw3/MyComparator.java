package edu.hw3;

import java.util.Comparator;

public class MyComparator implements Comparator<Stock>{
    public int compare(Stock s1, Stock s2){
        return (int) (s1.cost - s2.cost) * 1000;
    }    
}
