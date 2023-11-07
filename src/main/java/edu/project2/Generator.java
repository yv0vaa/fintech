package edu.project2;

import java.util.ArrayList;
import java.util.Vector;

public final class Generator {

    private static int seed = (int) Math.random() * 239;
    private static int mod = 4;
    private static int a = 239;
    private static int c = 41;

    private static int nextRand() {
        seed = (a * seed + c) % mod;
        return seed;
    }

    private Generator() {}

    public enum Sides {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        FINISH
    }

    private static void dfs (int row, int col, Vector<Vector<ArrayList<Sides>>> field, boolean[][] used) {
        if (used[row][col]) {
            return;
        }
        used[row][col] = true;
        if (col == field.size() - 1 || row == field.elementAt(0).size() - 1) {
            field.elementAt(row).elementAt(col).add(Generator.Sides.FINISH);
            return;
        }
        var side1 = switch (Generator.nextRand()) {
            case 0 -> Generator.Sides.UP;
            case 1 -> Generator.Sides.RIGHT;
            case 2 -> Generator.Sides.DOWN;
            default -> Generator.Sides.LEFT;
        };
        var side2 = switch (Generator.nextRand()) {
            case 0 -> Generator.Sides.UP;
            case 1 -> Generator.Sides.RIGHT;
            case 2 -> Generator.Sides.DOWN;
            default -> Generator.Sides.LEFT;
        };
        if (side1 == Generator.Sides.UP) {
            dfs(row + 1, col, field, used);
        } else if (side1 == Generator.Sides.RIGHT) {
            dfs(row, col + 1, field, used);
        } else if (side1 == Generator.Sides.DOWN) {
            dfs(row - 1, col, field, used);
        } else {
            dfs(row, col - 1, field, used);
        }
        if (side2 == Generator.Sides.UP) {
            dfs(row + 1, col, field, used);
        } else if (side2 == Generator.Sides.RIGHT) {
            dfs(row, col + 1, field, used);
        } else if (side2 == Generator.Sides.DOWN) {
            dfs(row - 1, col, field, used);
        } else {
            dfs(row, col - 1, field, used);
        }
        if (side1 != side2) {
            field.elementAt(row).elementAt(col).add(side1);
        }
        field.elementAt(row).elementAt(col).add(side2);
    }

    public static Vector<Vector<ArrayList<Sides>>> generate(int n, int m) {
        Vector<Vector<ArrayList<Sides>>> res = new Vector<Vector<ArrayList<Sides>>>(n);
        for (int i = 0; i < n; i++) {
            res.add(i, new Vector<ArrayList<Sides>>(m));
        }
        for (var elem : res) {
            System.out.println(elem.toString());
        }
        System.out.println(res.size() + " " + res.elementAt(0).size());
        boolean[][] used = new boolean[n][m];
        dfs(0, 0, res, used);
        return res;
    }
}
