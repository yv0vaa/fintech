package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"uncommentedmain"})
public final class Task1Test {
    private Task1Test() {}

    @Test
    public static void test() {
        String[] array = {
            "2022-03-12, 20:20 - 2022-03-12, 23:50", 
            "2022-04-01, 21:30 - 2022-04-02, 01:20"
        };
        assertEquals("3ч 40м", Task1.countAve(array));
        array = new String[]{
            "2022-03-12, 20:20 - 2022-03-12, 23:50", 
            "2022-04-01, 21:30 - 2022-04-02, 01:20", 
            "2022-03-01, 00:00 - 2022-03-02, 00:00"
        };
        assertEquals("10ч 26м", Task1.countAve(array));
    }

    public static void main(String[] args) {
        test();
    }
}
