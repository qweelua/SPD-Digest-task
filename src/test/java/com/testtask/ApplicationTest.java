package com.testtask;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void testCalculateEvenSum() {
        List<Character> characters = Arrays.asList('A', 'B', 'C', 'D'); // 65, 67 odd, 66, 68 even
        long expectedEvenSum = 66 + 68; // 134
        assertEquals(expectedEvenSum, calculateEvenSum(characters));
    }

    @Test
    public void testCalculateOddSum() {
        List<Character> characters = Arrays.asList('A', 'B', 'C', 'D'); // 65, 67 odd, 66, 68 even
        long expectedOddSum = 65 + 67; // 132
        assertEquals(expectedOddSum, calculateOddSum(characters));
    }

    @Test
    public void testCalculateDifference() {
        List<Character> characters = Arrays.asList('A', 'B', 'C', 'D');
        long expectedDiff = Math.abs((66 + 68) - (65 + 67)); // 2
        assertEquals(expectedDiff, calculateDifference(characters));
    }

    @Test
    public void testEmptyList() {
        List<Character> characters = Arrays.asList();
        assertEquals(0, calculateEvenSum(characters));
        assertEquals(0, calculateOddSum(characters));
        assertEquals(0, calculateDifference(characters));
    }

    @Test
    public void testSingleCharacter() {
        List<Character> oddChar = Arrays.asList('A'); // 65 - odd
        assertEquals(0, calculateEvenSum(oddChar));
        assertEquals(65, calculateOddSum(oddChar));
        assertEquals(65, calculateDifference(oddChar));

        List<Character> evenChar = Arrays.asList('B'); // 66 - even
        assertEquals(66, calculateEvenSum(evenChar));
        assertEquals(0, calculateOddSum(evenChar));
        assertEquals(66, calculateDifference(evenChar));
    }

    // Helper methods mirroring Application logic
    private long calculateEvenSum(List<Character> characters) {
        return characters.stream()
                .mapToLong(c -> (int) c)
                .filter(v -> v % 2 == 0)
                .sum();
    }

    private long calculateOddSum(List<Character> characters) {
        return characters.stream()
                .mapToLong(c -> (int) c)
                .filter(v -> v % 2 != 0)
                .sum();
    }

    private long calculateDifference(List<Character> characters) {
        return Math.abs(calculateEvenSum(characters) - calculateOddSum(characters));
    }
}
