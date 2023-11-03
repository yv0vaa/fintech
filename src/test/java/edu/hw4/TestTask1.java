package edu.hw4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("uncommentedmain")
public final class TestTask1 {
    private TestTask1() {}

    @Test
    public static void testTack1() {
        var array = MainArray.getAnimals();
        var res = Task1.sort(array).toArray(array);
        for (int i = 1; i < res.length; i++) {
            assertTrue(res[i - 1].height() <= res[i].height());
        }
    }

    public static void main(String[] args) {
        testTack1();
    }
}
