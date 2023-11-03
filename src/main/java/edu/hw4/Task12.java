package edu.hw4;

public final class Task12 {
    private Task12() {}

    public static Integer biggerWeight(Animal[] animals) {
        Integer res = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].weight() > animals[i].height()) {
                res++;
            }
        }
        return res;
    }
}
