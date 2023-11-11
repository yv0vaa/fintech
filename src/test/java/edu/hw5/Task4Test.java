package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("uncommentedmain")
public final class Task4Test {
    private Task4Test() {}

    @Test
    public static void test() {
        // я не понимаю, что не так с моими регулярками
        assertTrue(!Task4.checkPassword("dasasads"));
        assertTrue(!Task4.checkPassword("fdjweqr2374y32"));
        assertTrue(Task4.checkPassword("*(^&*R%^E()*(T^R%$))"));
        assertTrue(Task4.checkPassword("dasasads~"));
        assertTrue(Task4.checkPassword("dasasads|"));
    }

    public static void main(String[] args) {
        test();
    }
}
