package edu.hw4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"uncommentedmain", "MagicNumberCheck"})
public final class TestTask5 {
    private TestTask5() {}

    @Test
    public static void testTask5() {
        var array = MainArray.getAnimals();
        assertEquals(Animal.Sex.M, Task5.mostFreq(array));
    }

    public static void main(String[] args) {
        testTask5();
    }
}
