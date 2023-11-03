package edu.hw3;

import java.util.ArrayList;

public class Clusterize {
    public static ArrayList<String> clusterize(String s){
        int balance = 0;
        String cur = "";
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                balance++;
                cur += '(';
            } else {
                if (--balance == 0){
                    cur += ')';
                    result.add(cur);
                    cur = "";
                } else {
                    cur += ')';
                }
            }
        }
        return result;
    }
}
