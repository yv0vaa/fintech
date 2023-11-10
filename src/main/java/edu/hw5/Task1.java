package edu.hw5;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class Task1 {
    private Task1() {}

    public static String countAve(String[] info) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, HH:mm");
        long delta = 0;
        for (int i = 0; i < info.length; i++) {
            var temp = info[i].split(" - ");
            try {
                delta += sdf.parse(temp[1]).getTime() - sdf.parse(temp[0]).getTime();
            } catch (ParseException e) {
                System.out.println("Wrong time format");
            }
        }
        delta /= info.length; // ave
        delta /= 1000; // seconds
        return (delta / 3600) + "ч " + (delta % 3600) / 60 + "м";
    }
}
