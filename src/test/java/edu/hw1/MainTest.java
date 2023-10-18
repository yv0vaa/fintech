package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest{
    @Test
    private static void TestFirst(){
        assertEquals(60, Solution.minutesToSeconds("01:00"));
        assertEquals(836, Solution.minutesToSeconds("13:56"));
        assertEquals(-1, Solution.minutesToSeconds("10:60"));
        assertEquals(-1, Solution.minutesToSeconds("01:78"));
    }
    @Test 
    private static void TestSecond(){
        assertEquals(4, Solution.countDigits(4666));
        assertEquals(3, Solution.countDigits(544));
        assertEquals(1, Solution.countDigits(0));
    }
    @Test
    private static void TestThird(){
        int[] a1 = new int[] {1, 2, 3, 4};
        int[]a2 = new int[] {0, 6};
        assertEquals(true, Solution.isNestable(a1, a2));
        a1 = new int[] {3, 1};
        a2 = new int[] {4, 0};
        assertEquals(true, Solution.isNestable(a1, a2));
        a1 = new int[] {9, 9, 8};
        a2 = new int[] {8, 9};
        assertEquals(false, Solution.isNestable(a1, a2));
        a1 = new int[] {1, 2, 3, 4};
        a2 = new int[] {2, 3};
        assertEquals(false, Solution.isNestable(a1, a2));
    }
    @Test
    public static void TestFourth(){
        assertEquals("214365", Solution.fixString("123456"));
        assertEquals("This is a mixed up string.", Solution.fixString("hTsii  s aimex dpus rtni.g"));  
        assertEquals("abcde", Solution.fixString("badce")); 
    }
    @Test
    public static void TestFifth(){
        assertEquals(true, Solution.isPalindromeDescendant(11211230)); // 11211230 -> 2333 -> 56 -> 11
        assertEquals(true, Solution.isPalindromeDescendant(13001120)); // 13001120 -> 4022 ➞ 44
        assertEquals(true, Solution.isPalindromeDescendant(23336014)); // 23336014 -> 5665
        assertEquals(true, Solution.isPalindromeDescendant(11)); 
    }
    @Test
    public static void TestSixth(){
        assertEquals(5, Solution.countK(6621));
        assertEquals(4, Solution.countK(6554));
        assertEquals(3, Solution.countK(1234));
    }
    @Test
    public static void TestSevens(){
        assertEquals(4, Solution.rotateRight(8, 1));
        //assertEquals(1, Solution.rotateLeft(16, 1));
        //assertEquals(6, Solution.rotateLeft(17, 2));
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
        assertEquals(true, Solution.knightBoardCapture(field));
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
        assertEquals(false, Solution.knightBoardCapture(field));
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
        assertEquals(false, Solution.knightBoardCapture(field));
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
        // SevensGroup
        TestSevens();
        // EightsGroup
        TestEights();
    }
}
