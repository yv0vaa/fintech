package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task7 {
    private Task7() {}

    public static boolean subtack1(String s) {
        Pattern pattern = Pattern.compile("[0-1][0-1]1.*");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static boolean subtack2(String s) {
        Pattern pattern = Pattern.compile("^[0-1]$|^[0-1].*\\1$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static boolean subtack3(String s) {
        Pattern pattern = Pattern.compile("^[0-1]$|^[0-1][0-1]$|^[0-1][0-1][0-1]$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
