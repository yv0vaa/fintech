package edu.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public final class Task1 {

    private Task1() {}

    public static ArrayList<Animal> sort(Animal[] animals) {
        Arrays.sort(animals, new CompareHeight());
        ArrayList<Animal> res = new ArrayList(Arrays.asList(animals));
        return res;
    }
}
