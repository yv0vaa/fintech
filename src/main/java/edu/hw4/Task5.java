package edu.hw4;

public final class Task5 {
    private Task5() {}

    public static Animal.Sex mostFreq(Animal[] animals) {
        int cntm = 0;
        int cntf = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].sex() == Animal.Sex.F) {
                cntf++;
            } else {
                cntm++;
            }
        }
        return cntf > cntm ? Animal.Sex.F : Animal.Sex.M;
    }
}
