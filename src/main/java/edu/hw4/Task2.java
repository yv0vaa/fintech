package edu.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public final class Task2 {
    private Task2() {}

    public static ArrayList<Animal> sort(Animal[] animals) {
        Arrays.sort(animals, new CompareWeight());
        ArrayList<Animal> res = new ArrayList(Arrays.asList(animals));
        return res;
    }
}
