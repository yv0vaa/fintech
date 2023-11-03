package edu.hw4;

import java.util.HashMap;
import java.util.Map;

public final class Task3 {
    private Task3() {}

    public static Map<Animal.Type, Integer> freqDict(Animal[] animals) {
        Map<Animal.Type, Integer> map = new HashMap<>();
        for (int i = 0; i < animals.length; i++) {
            if (!map.containsKey(animals[i].type())) {
                map.put(animals[i].type(), 1);
            } else {
                map.put(animals[i].type(), map.get(animals[i].type()) + 1);
            }
        }
        return map;
    }
}
