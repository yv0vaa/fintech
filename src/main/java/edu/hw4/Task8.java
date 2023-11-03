package edu.hw4;

import java.util.Optional;

public final class Task8 {
    private Task8() {}

    public static Optional<Animal> mostHeavyAbove(Animal[] animals, int height) {
        Optional<Animal> animal = Optional.empty();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].height() < height) {
                if (!animal.isPresent() || animal.get().weight() < animals[i].weight()) {
                    animal = Optional.of(animals[i]);
                }
            }
        }
        return animal;
    }
}
