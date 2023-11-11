package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task5 {
    private Task5() {}

    public static boolean validate(String number) {
        Pattern pattern = Pattern.compile("^[А-Я]\\d{3}[А-Я][А-Я]\\d{3}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
}
