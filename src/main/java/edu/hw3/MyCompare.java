package edu.hw3;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {
    public int compare(String s1, String s2){
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
        if (w1.length == 1){
            if (w2.length == 1){
                return w1[0].compareTo(w2[0]);
            } else {
                return w1[0].compareTo(w2[1]);
            }
        } else {
            if (w2.length == 1){
                return w1[1].compareTo(w2[0]);
            }
        }
        return w1[1].compareTo(w2[1]);
    }
}