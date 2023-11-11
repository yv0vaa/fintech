package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("uncommentedmain")
public final class Task6Test {
    private Task6Test() {}

    @Test
    public static void test() {
        assertTrue(Task6.isSubstring("abobabobaiba", "abo"));
        assertTrue(Task6.isSubstring("123123123123", "123123"));
        assertFalse(Task6.isSubstring("null", "oh noooooooo"));
        assertTrue(Task6.isSubstring("not substring", "substring"));
    }

    public static void main(String[] args) {
        test();
    }
}
