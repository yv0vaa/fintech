package edu.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestConvertToRoman {
    @Test
    public static void TestConverttoRoman(){
        assertEquals("II", ConvertToRoman.ConverttoRoman(2));
        assertEquals("XII", ConvertToRoman.ConverttoRoman(12));
        assertEquals("XVI", ConvertToRoman.ConverttoRoman(16));
        assertEquals("XIX", ConvertToRoman.ConverttoRoman(19));
    }
    public static void main(String[] args) {
        TestConverttoRoman();
    }
}
