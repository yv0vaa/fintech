package edu.hw4;

import java.util.ArrayList;
import java.util.Optional;


public final class Task18 {
    private Task18() {}

    public static Optional<Animal> heviestFish(ArrayList<Animal>[] lists) {
        Optional<Animal> res = Optional.empty();
        for (int i = 0; i < lists.length; i++) {
            for (var animal : lists[i]) {
                if (animal.type() == Animal.Type.FISH) {
                    if (!res.isPresent() && res.get().weight() < animal.weight()) {
                        res = Optional.of(animal);
                    }
                }
            }
        }
        return res;
    }
}
