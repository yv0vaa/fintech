package edu.hw4;

public final class Task17 {
    private Task17() {}

    public static boolean isTrue(Animal[] animals) {
        int dogBites = 0;
        int spiderBites = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].type() == Animal.Type.DOG && animals[i].bites()) {
                dogBites++;
            } else if (animals[i].type() == Animal.Type.SPIDER && animals[i].bites()) {
                spiderBites++;
            }
        }
        if (dogBites + spiderBites == 0) {
            return false;
        }
        return spiderBites > dogBites;
    }
}
