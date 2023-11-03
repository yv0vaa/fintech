package edu.hw4;

public final class Task9 {
    private Task9() {}

    public static Integer countPaws(Animal[] animals) {
        Integer res = 0;
        for (int i = 0; i < animals.length; i++) {
            res += animals[i].paws();
        }
        return res;
    }
}
