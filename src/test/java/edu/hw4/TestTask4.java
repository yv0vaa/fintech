package edu.hw4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"uncommentedmain", "MagicNumberCheck"})
public final class TestTask4 {
    private TestTask4() {}

    @Test
    public static void testTask4() {
        String s = "jsdvjavefdsverkveruifhbrgrfhdfxbvkjsbvdfdwedweqdewq";
        var array = MainArray.getAnimals();
        var res = Task4.longestName(array);
        assertEquals("Marina Vishnevskaya", res);
        Animal animal = new Animal(s, null, null, 0, 0, 0, false);
        array[0] = animal;
        res = Task4.longestName(array);
        assertEquals(s, res);
    }

    public static void main(String[] args) {
        testTask4();
    }
}
