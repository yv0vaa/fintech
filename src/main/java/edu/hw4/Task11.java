package edu.hw4;

import java.util.ArrayList;

public final class Task11 {
    private Task11() {}

    public static ArrayList<Animal> task(Animal[] animals) {
        ArrayList<Animal> res = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].bites() && animals[i].height() > 100) {
                res.add(animals[i]);
            }
        }
        return res;
    }
}
