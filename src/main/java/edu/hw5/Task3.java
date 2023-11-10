package edu.hw5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task3 {
    private Task3() {}

    public static Optional<LocalDate> parseDate(String string) {
        if (string.equals("today")) {
            return Optional.of(LocalDate.now());
        } else if (string.equals("tomorrow")) {
            return Optional.of(LocalDate.now().plusDays(1));
        } else if (string.equals("yesterday")) {
            return Optional.of(LocalDate.now().minusDays(1));
        }
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return Optional.of(sdf.parse(string).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } catch (ParseException e) {
                return Optional.empty();
            }
        }
        pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{1}$");
        matcher = pattern.matcher(string);
        if (matcher.find()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d");
            try {
                return Optional.of(sdf.parse(string).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } catch (ParseException e) {
                return Optional.empty();
            }
        }
        pattern = Pattern.compile("^\\d{1}/\\d{1}/\\d{4}$");
        matcher = pattern.matcher(string);
        if (matcher.find()) {
            SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
            try {
                return Optional.of(sdf.parse(string).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } catch (ParseException e) {
                return Optional.empty();
            }
        }
        pattern = Pattern.compile("^\\d{1}/\\d{1}/\\d{2}$");
        matcher = pattern.matcher(string);
        if (matcher.find()) {
            SimpleDateFormat sdf = new SimpleDateFormat("d/M/yy");
            try {
                return Optional.of(sdf.parse(string).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } catch (ParseException e) {
                return Optional.empty();
            }
        }
        pattern = Pattern.compile("ago$");
        matcher = pattern.matcher(string);
        if (matcher.find()) {
            return Optional.of(LocalDate.now().minusDays(Integer.parseInt(string.split(" ")[0])));
        }
        return Optional.empty();
    }
}
