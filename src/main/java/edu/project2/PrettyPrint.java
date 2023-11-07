package edu.project2;

import java.util.ArrayList;
import java.util.Vector;

public final class PrettyPrint {
    private PrettyPrint() {}

    private static void printdown(Vector<Vector<ArrayList<Generator.Sides>>> field, int i, int j) {
        var side = field.elementAt(i).elementAt(j).get(0);
        if (field.elementAt(i).elementAt(j).size() == 1) {
            if (side != Generator.Sides.DOWN) {
                System.out.print("---");
            }
        } else {
            var side2 = field.elementAt(i).elementAt(j).get(1);
            if (side2 != Generator.Sides.DOWN) {
                System.out.print("---");
            }
        }
    }

    private static void printsides(Vector<Vector<ArrayList<Generator.Sides>>> field, int i, int j) {
        var side = field.elementAt(i).elementAt(j).get(0);
        if (field.elementAt(i).elementAt(j).size() == 1) {
            if (side == Generator.Sides.UP) {
                return;
            } else if (side == Generator.Sides.RIGHT) {
                System.out.print("|  ");
            } else if (side == Generator.Sides.LEFT) {
                System.out.print("  |");
            } else {
                System.out.print("|   |");
            }
        } else {
            var side2 = field.elementAt(i).elementAt(j).get(1);
            if (side == Generator.Sides.LEFT && side2 == Generator.Sides.RIGHT
            || side == Generator.Sides.RIGHT && side2 == Generator.Sides.LEFT) {
                System.out.print("    ");
            } else if (side == Generator.Sides.LEFT || side2 == Generator.Sides.LEFT) {
                System.out.print("  |");
            } else if (side2 == Generator.Sides.RIGHT || side == Generator.Sides.RIGHT) {
                System.out.print("  |");
            }
        }
    }
    public static void prettyPrint(Vector<Vector<ArrayList<Generator.Sides>>> field) {
        int n = field.size();
        int m = field.elementAt(0).size();
        String s = "---".repeat(n);
        System.out.println(s);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                printsides(field, i, j);
            }
            for (int j = 0; j < m; j++) {
                printdown(field, i, j);
            }
            System.out.println("\n");
        }
    }
}
