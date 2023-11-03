package edu.hw4;

import java.util.Comparator;

public class CompareMaleAndName implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        if (a1.sex() == a2.sex()) {
            return a1.name().compareTo(a2.name());
        } else if (a1.sex() == Animal.Sex.M) {
            return 1;
        }
        return -1;
    }
}
