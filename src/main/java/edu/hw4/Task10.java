package edu.hw4;

import java.util.ArrayList;

public final class Task10 {
    private Task10() {}

    public static ArrayList<Animal> task(Animal[] animals) {
        ArrayList<Animal> res = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].age() != animals[i].paws()) {
                res.add(animals[i]);
            }
        }
        return res;
    }
}
