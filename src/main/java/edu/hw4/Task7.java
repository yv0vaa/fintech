package edu.hw4;

import java.util.Arrays;

public final class Task7 {
    private Task7() {}

    public static Animal kthOldest(int k, Animal[] animals) {
        Arrays.sort(animals);
        return animals[k];
    }
}
