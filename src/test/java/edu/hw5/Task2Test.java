package edu.hw5;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("uncommentedmain")
public final class Task2Test {
    private Task2Test() {}

    @Test
    public static void test() {
        var res = Task2.countFridays(1925);
        ArrayList<LocalDate> exp = new ArrayList<>();
        exp.add(LocalDate.of(1925, 2, 13));
        exp.add(LocalDate.of(1925, 3, 13));
        exp.add(LocalDate.of(1925, 11, 13));
        for (int i = 0; i < exp.size(); i++) {
            assertEquals(exp.get(i), res.get(i));
        }
        exp.clear();
        exp.add(LocalDate.of(2024, 9, 13));
        exp.add(LocalDate.of(2024, 12, 13));
        res = Task2.countFridays(2024);
        for (int i = 0; i < exp.size(); i++) {
            assertEquals(exp.get(i), res.get(i));
        }
    }

    @Test
    public static void test1() {
        assertEquals(LocalDate.of(2024, 9, 13), Task2.nextFriday("2024:01:28"));
        assertEquals(LocalDate.of(2024, 12, 13), Task2.nextFriday("2024:10:28"));
        assertEquals(LocalDate.of(1925, 2, 13), Task2.nextFriday("1924:10:18"));
        assertEquals(LocalDate.of(1925, 3, 13), Task2.nextFriday("1925:02:13"));
    }

    public static void main(String[] args) {
        test();
        test1();
    }
}
