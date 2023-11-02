package edu.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParseContacts {
    @Test
    public static void TestParsecontacts(){
        String[] array = new String[] {"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"};
        String[] input = new String[] {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        assertEquals(array, ParseContacts.parseContacts(input, "ASC"));
        array = new String[]{"Carl Gauss", "Leonhard Euler", "Paul Erdos"};
        input = new String[]{"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        assertEquals(array, ParseContacts.parseContacts(input, "DESC"));
    }
    public static void main(String[] args) {
        TestParsecontacts();
    }
}