package edu.hw4;

import java.util.ArrayList;

public final class Task13 {
    private Task13() {}

    public static ArrayList<Animal> longName(Animal[] animals) {
        ArrayList<Animal> res = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name().split(" ").length > 2) {
                res.add(animals[i]);
            }
        }
        return res;
    }
}
