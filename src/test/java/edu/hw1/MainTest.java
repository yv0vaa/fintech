package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest{
    @Test
    private static void TestFirst(){
        assertEquals(Solution.minutesToSeconds("01:00"), 60);
        assertEquals(Solution.minutesToSeconds("13:56"), 836);
        assertEquals(Solution.minutesToSeconds("10:60"), -1);
    }
    @Test 
    private static void TestSecond(){
        assertEquals(Solution.countDigits(4666), 4);
        assertEquals(Solution.countDigits(544), 3);
        assertEquals(Solution.countDigits(0), 1);
    }
    @Test
    private static void TestThird(){
        int[] a1 = new int[] {1, 2, 3, 4};
        int[]a2 = new int[] {0, 6};
        assertEquals(Solution.isNestable(a1, a2), true);
        a1 = new int[] {3, 1};
        a2 = new int[] {4, 0};
        assertEquals(Solution.isNestable(a1, a2), true);
        a1 = new int[] {9, 9, 8};
        a2 = new int[] {8, 9};
        assertEquals(Solution.isNestable(a1, a2), false);
        a1 = new int[] {1, 2, 3, 4};
        a2 = new int[] {2, 3};
        assertEquals(Solution.isNestable(a1, a2), false);
    }
    @Test
    public static void TestFourth(){
        assertEquals(Solution.fixString("123456"), "214365");
        assertEquals(Solution.fixString("hTsii  s aimex dpus rtni.g"), "This is a mixed up string.");  
        assertEquals(Solution.fixString("badce"), "abcde"); 
    }
    @Test
    public static void TestFifth(){
        assertEquals(Solution.isPalindromeDescendant(11211230), true); // 11211230 -> 2333 -> 56 -> 11
        assertEquals(Solution.isPalindromeDescendant(13001120), true); // 13001120 -> 4022 ➞ 44
        assertEquals(Solution.isPalindromeDescendant(23336014), true); // 23336014 -> 5665
        assertEquals(Solution.isPalindromeDescendant(11), true); 
    }
    @Test
    public static void TestSixth(){
        assertEquals(Solution.countK(6621), 5);
        assertEquals(Solution.countK(6554), 4);
        assertEquals(Solution.countK(1234), 3);
    }
    @Test
    public static void TestEights(){
        int[][] field = new int[][] {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}
        };
        assertEquals(Solution.knightBoardCapture(field), true);
        field = new int[][]{
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1}
        };
        assertEquals(Solution.knightBoardCapture(field), false);
        field = new int[][] {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}
        };
        assertEquals(Solution.knightBoardCapture(field), false);
    }
    public static void main(String[] args){
        Solution.prt();
        // FirstGroup
        TestFirst();
        // SecondGroup
        TestSecond();
        // TrirdGroup
        TestThird();
        // FourthGroup
        TestFourth();
        // FifthGroup
        TestFifth();
        // SixthGroup 
        TestSixth();
        // EightsGroup
        TestEights();
    }
}