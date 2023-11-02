package edu.hw3;
import java.util.HashMap;
import java.util.ArrayList;

public class FreqDict {
    public static HashMap<Object, Integer> Freqdict(ArrayList<Object> array){
        HashMap<Object, Integer> map = new HashMap<>();
        for (var elem : array){
            if (!map.containsKey(elem)){
                map.put(elem, 0);
            }
            map.put(elem, map.get(elem) + 1);
        }
        return map;
    }     
}
