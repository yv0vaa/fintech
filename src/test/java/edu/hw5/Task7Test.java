package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("uncommentedmain")
public final class Task7Test {
    private Task7Test() {}

    @Test
    public static void test1subtack1() {
        assertFalse(Task7.subtack1("01"));
    }

    @Test
    public static void test2subtack1() {
        assertFalse(Task7.subtack1("011"));
    }

    @Test
    public static void test3subtack1() {
        assertTrue(Task7.subtack1("000"));
    }

    @Test
    public static void test4subtack1() {
        assertFalse(Task7.subtack1("aaa"));
    }

    @Test
    public static void test5subtack1() {
        assertTrue(Task7.subtack1("011010010101010"));
    }

    @Test
    public static void test1subtack2() {
        assertFalse(Task7.subtack2("101010101110"));
    }

    @Test
    public static void test2subtack2() {
        assertTrue(Task7.subtack2("10101010101"));
    }

    @Test
    public static void test3subtack2() {
        assertTrue(Task7.subtack2("010101010"));
    }

    @Test
    public static void test1subtack3() {
        assertFalse(Task7.subtack3(" "));
    }

    @Test
    public static void test2subtack3() {
        assertTrue(Task7.subtack3("1"));
    }

    @Test
    public static void test3subtack3() {
        assertTrue(Task7.subtack3("10"));
    }

    @Test
    public static void test4subtack3() {
        assertTrue(Task7.subtack3("10"));
    }

    @Test
    public static void test5subtack3() {
        assertTrue(Task7.subtack3("111"));
    }

    @Test
    public static void test6subtack3() {
        assertFalse(Task7.subtack3("100000"));
    }

    public static void main(String[] args) {
        test1subtack1();
        test1subtack2();
        test1subtack3();
        test2subtack1();
        test2subtack2();
        test2subtack3();
        test3subtack1();
        test3subtack2();
        test3subtack3();
        test4subtack1();
        test4subtack3();
        test5subtack1();
        test6subtack3();
    }
}
