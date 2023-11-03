package edu.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public final class Task16 {
    private Task16() {}

    public static ArrayList<Animal> sort(Animal[] animals) {
        Arrays.sort(animals, new CompareMaleAndName());
        return new ArrayList<>(Arrays.asList(animals));
    }
}
