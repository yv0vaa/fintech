package edu.hw4;

public final class Task14 {
    private Task14() {}

    public static Boolean isDog(Animal[] animals, int k) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].type() == Animal.Type.DOG && animals[i].height() > k) {
                return true;
            }
        }
        return false;
    }
}
