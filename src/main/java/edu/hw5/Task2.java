package edu.hw5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public final class Task2 {
    private Task2() {}

    public static ArrayList<LocalDate> countFridays(int year) {
        ArrayList<LocalDate> res = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            LocalDate date = LocalDate.of(year, i, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                res.add(date);
            }
        }
        return res;
    }

    public static LocalDate nextFriday(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd");
        int year = 0;
        try {
            LocalDate date = sdf.parse(data).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            year = date.getYear();
            var ths = countFridays(year);
            for (var day : ths) {
                if (day.compareTo(date) > 0) {
                    return day;
                }
            }
            ths = countFridays(year + 1);
            return ths.get(0);
        } catch (ParseException e) {
            System.out.println(e);
            return null;
        }
    }
}
