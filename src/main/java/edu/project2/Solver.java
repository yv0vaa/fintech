package edu.project2;

import java.util.ArrayList;
import java.util.Vector;

public final class Solver {
    private Solver() {}

    private static boolean checkSide(Generator.Sides side, int row, int col,
    Vector<Vector<ArrayList<Generator.Sides>>> field,
    ArrayList<Generator.Sides> ans, boolean[][] used) {
        if (side == Generator.Sides.FINISH) {
            ans.add(side);
            return true;
        }
        if (side == Generator.Sides.LEFT) {
            if (col - 1 >= 0) {
                if (dfs(row, col - 1, field, ans, used)) {
                    ans.add(Generator.Sides.LEFT);
                    return true;
                }
            }
        } else if (side == Generator.Sides.UP) {
            if (row + 1 < field.size()) {
                if (dfs(row + 1, col, field, ans, used)) {
                    ans.add(Generator.Sides.UP);
                    return true;
                }
            }
        } else if (side == Generator.Sides.RIGHT) {
            if (col + 1 < field.elementAt(0).size()) {
                if (dfs(row, col + 1, field, ans, used)) {
                    ans.add(Generator.Sides.UP);
                    return true;
                }
            }
        } else {
            if (row - 1 >= 0) {
                if (dfs(row - 1, col, field, ans, used)) {
                    ans.add(Generator.Sides.DOWN);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int row, int col, Vector<Vector<ArrayList<Generator.Sides>>> field,
    ArrayList<Generator.Sides> ans, boolean[][] used) {
        if (row < 0 || col < 0 || row >= field.size() || col >= field.elementAt(0).size()) {
            return false;
        }
        if (used[row][col]) {
            return false;
        }
        used[row][col] = true;
        var side = field.elementAt(row).elementAt(col).get(0);
        if (checkSide(side, row, col, field, ans, used)) {
            return true;
        }
        if (field.elementAt(row).elementAt(col).size() > 1) {
            side = field.elementAt(row).elementAt(col).get(1);
            if (checkSide(side, row, col, field, ans, used)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Generator.Sides> solve(Vector<Vector<ArrayList<Generator.Sides>>> field) {
        int n = field.size();
        int m = field.elementAt(0).size();
        boolean[][] used = new boolean[n][m];
        ArrayList<Generator.Sides> ans = new ArrayList<>();
        dfs(n, m, field, ans, used);
        return ans;
    }
}
