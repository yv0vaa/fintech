package edu.hw4;

import java.util.Comparator;

public class CompareAge implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.age() - a2.age();
    }
}
