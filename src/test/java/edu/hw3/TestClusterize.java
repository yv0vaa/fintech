package edu.hw3;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class TestClusterize {
    @Test
    public static void Testclusterize(){
        ArrayList<String> array = new ArrayList<>(Arrays.asList("()", "()", "()"));
        assertEquals(array, Clusterize.clusterize("()()()"));
        array = new ArrayList<>(Arrays.asList("((()))"));
        assertEquals(array, Clusterize.clusterize("((()))"));
        array = new ArrayList<>(Arrays.asList("((()))", "(())", "()", "()", "(()())"));
        assertEquals(array, Clusterize.clusterize("((()))(())()()(()())"));
        array = new ArrayList<>(Arrays.asList("((())())", "(()(()()))"));
        assertEquals(array, Clusterize.clusterize("((())())(()(()()))"));
    }    
    public static void main(String[] args) {
        Testclusterize();
    }
}
