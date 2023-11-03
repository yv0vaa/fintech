package edu.hw4;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"uncommentedmain"})
public final class TestTask3 {
    private TestTask3() {}

    @Test
    public static void testTask3() {
        var array = MainArray.getAnimals();
        Map<Animal.Type, Integer> map = new HashMap<>();
        map.put(Animal.Type.BIRD, 2);
        map.put(Animal.Type.FISH, 2);
        map.put(Animal.Type.DOG, 2);
        map.put(Animal.Type.CAT, 2 + 1);
        map.put(Animal.Type.SPIDER, 2);
        var res = Task3.freqDict(array);
        assertEquals(map, res);
    }

    public static void main(String[] args) {
        testTask3();
    }
}
