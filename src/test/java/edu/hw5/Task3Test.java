package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.Optional;

@SuppressWarnings("uncommentedmain")
public final class Task3Test {
    private Task3Test() {}

    @Test
    public static void test() {
        assertEquals(Optional.of(LocalDate.now().minusDays(1)), Task3.parseDate("yesterday"));
        assertEquals(Optional.of(LocalDate.now().plusDays(1)), Task3.parseDate("tomorrow"));
        assertEquals(Optional.of(LocalDate.now().minusDays(1)), Task3.parseDate("1 day ago"));
        assertEquals(Optional.of(LocalDate.now().minusDays(30)), Task3.parseDate("30 day ago"));
        assertEquals(Optional.of(LocalDate.now().minusDays(213)), Task3.parseDate("213 day ago"));
        assertEquals(Optional.of(LocalDate.of(2020, 10, 10)), Task3.parseDate("2020-10-10"));
        assertEquals(Optional.of(LocalDate.of(2020, 12, 2)), Task3.parseDate("2020-12-2"));
        assertEquals(Optional.of(LocalDate.of(1976, 3, 1)), Task3.parseDate("1/3/1976"));
        assertEquals(Optional.of(LocalDate.of(2020, 3, 1)), Task3.parseDate("1/3/20"));
        assertEquals(Optional.empty(), Task3.parseDate("aboba"));
    }

    public static void main(String[] args) {
        test();
    }
}
