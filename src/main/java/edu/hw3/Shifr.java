package edu.hw3;

public class Shifr {
    private static int get(char c){
        if ('a' <= c && c <= 'z'){
            return c - 'a';
        }
        return  c - 'A';
    }
    public static String atbash(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            if ('a' <= s.charAt(i) && s.charAt(i)<= 'z'){
                ans += (char) ('z' - get(s.charAt(i)));
            } else if ('A' <= s.charAt(i) && s.charAt(i)<= 'Z'){
                ans += (char) ('Z' - get(s.charAt(i))); 
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
    
}