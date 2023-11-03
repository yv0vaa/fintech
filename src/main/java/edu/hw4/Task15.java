package edu.hw4;

import java.util.HashMap;
import java.util.Map;

public final class Task15 {
    private Task15() {}

    public static Map<Animal.Type, Integer> countSumWeight(Animal[] animals, int k, int l) {
        Map<Animal.Type, Integer> map = new HashMap<>();
        for (int i = 0; i < animals.length; i++) {
            if (k <= animals[i].age() && animals[i].age() <= l) {
                if (!map.containsKey(animals[i].type())) {
                    map.put(animals[i].type(), animals[i].weight());
                } else {
                    map.put(animals[i].type(), map.get(animals[i].type()) + animals[i].weight());
                }
            }
        }
        return map;
    }
}
