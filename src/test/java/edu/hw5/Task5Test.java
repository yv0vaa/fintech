package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SuppressWarnings("uncommentedmain")
public final class Task5Test {
    private Task5Test() {}

    @Test
    public static void test() {
        assertTrue(Task5.validate("А123ВЕ777"));
        assertTrue(Task5.validate("О777ОО177"));
        assertFalse(Task5.validate("123АВЕ777"));
        assertFalse(Task5.validate("А123ВГ77"));
        assertFalse(Task5.validate("А123ВЕ7777"));
    }

    public static void main(String[] args) {
        test();
    }
}
