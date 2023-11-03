package edu.hw4;

import java.util.HashMap;
import java.util.Map;

public final class Task6 {
    private Task6() {}

    public static Map<Animal.Type, Animal> mostHeavy(Animal[] animals) {
        Map<Animal.Type, Animal> map = new HashMap<>();
        for (int i = 0; i < animals.length; i++) {
            if (!map.containsKey(animals[i].type()) || map.get(animals[i].type()).weight() < animals[i].weight()) {
                map.put(animals[i].type(), animals[i]);
            }
        }
        return map;
    }
}
