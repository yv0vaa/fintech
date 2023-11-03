package edu.hw4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings({"uncommentedmain"})
public final class TestTask2 {
    private TestTask2() {}

    @Test
    public static void testTack2() {
        var array = MainArray.getAnimals();
        var res = Task2.task2(array, 2);
        assertTrue(res.size() == 2);
        int curw = Integer.MAX_VALUE;
        for (var elem : res) {
            assertTrue(curw >= elem.weight());
            curw = elem.weight();
        }
    }

    public static void main(String[] args) {
        testTack2();
    }
}
