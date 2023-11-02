package edu.hw3;

public class ConvertToRoman {
    public static String ConverttoRoman(int num){
        String ans = "";
        while (num / 1000 >= 1){
            ans += 'M';
            num -= 1000;
        }
        while (num / 900 >= 1){
            ans += "CM";
            num -= 900;
        }
        while (num / 500 >= 1){
            ans += 'D';
            num -= 500;
        }
        while (num / 400 >= 1){
            ans += "CD";
            num -= 400;
        }
        while (num / 100 >= 1){
            ans += 'C';
            num -= 100;
        }
        while (num / 90 >= 1){
            ans += "XC";
            num -= 90;
        }
        while (num / 50 >= 1){
            ans += 'L';
            num -= 50;
        }
        while (num / 40 >= 1){
            ans += "XL";
            num -= 40;
        }
        while (num / 10 >= 1){
            ans += 'X';
            num -= 10;
        }
        while (num / 9 >= 1){
            ans += "IX";
            num -= 90;
        }
        while (num / 5 >= 1){
            ans += 'V';
            num -= 5;
        }
        while (num / 4 >= 1){
            ans += "IV";
            num -= 4;
        }
        while (num > 0){
            ans += 'I';
            num -= 1;
        }
        return ans;
    }
}
