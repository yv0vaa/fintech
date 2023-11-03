package edu.hw4;

public final class Task4 {
    private Task4() {}

    public static String longestName(Animal[] animals) {
        String res = "";
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name().length() > res.length()) {
                res = animals[i].name();
            }
        }
        return res;
    }
}
