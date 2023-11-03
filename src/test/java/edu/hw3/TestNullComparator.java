package edu.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.TreeMap;
public class TestNullComparator {
    @Test
    public static void Test(){
        TreeMap<String, String> tree = new TreeMap<>(new NullComparator());
        tree.put(null, "test");
        assertEquals(true, tree.containsKey(null));
    }
    public static void main(String[] args) {
        Test();
    }
}
