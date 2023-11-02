package edu.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public class TestFreqDict {
    @Test
    public static void TestFreqdict(){
        HashMap <Object, Integer> map = new HashMap<>();
        map.put("bb", 2);
        map.put("a", 2);
        ArrayList<Object> array = new ArrayList<>(Arrays.asList("a", "bb", "a", "bb"));
        assertEquals(map, FreqDict.Freqdict(array));
        map.clear();
        array.clear();
        map.put("that", 1);
        map.put("and", 2);
        map.put("this", 1);
        array = new ArrayList<>(Arrays.asList("this", "and", "that", "and"));
        assertEquals(map, FreqDict.Freqdict(array));
        map.clear();
        array.clear();
        map.put("код", 3);
        map.put("bug", 1);
        array = new ArrayList<>(Arrays.asList("код", "код", "код", "bug"));
        assertEquals(map, FreqDict.Freqdict(array));
        map.clear();
        array.clear();
        map.put(1, 2);
        map.put(2, 2);
        array = new ArrayList<>(Arrays.asList(1, 1, 2, 2));
        assertEquals(map, FreqDict.Freqdict(array));
    }    
    public static void main(String[] args) {
        TestFreqdict();
    }
}
