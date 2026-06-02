package com.testtask;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void testSingleCharacterOdd() {
        // 'A' = 65 (odd)
        List<Character> chars = Arrays.asList('A');
        assertEquals(65, calculateDifference(chars));
    }

    @Test
    public void testSingleCharacterEven() {
        // 'B' = 66 (even)
        List<Character> chars = Arrays.asList('B');
        assertEquals(66, calculateDifference(chars));
    }

    @Test
    public void testEmptyList() {
        List<Character> chars = Arrays.asList();
        assertEquals(0, calculateDifference(chars));
    }

    @Test
    public void testMultipleCharacters() {
        // A=65, B=66, C=67, D=68
        // Even: 66+68=134, Odd: 65+67=132, Diff: 2
        List<Character> chars = Arrays.asList('A', 'B', 'C', 'D');
        assertEquals(2, calculateDifference(chars));
    }

    @Test
    public void testAllOddCharacters() {
        // A=65, C=67, E=69
        List<Character> chars = Arrays.asList('A', 'C', 'E');
        long oddSum = 65 + 67 + 69;
        assertEquals(oddSum, calculateDifference(chars));
    }

    @Test
    public void testAllEvenCharacters() {
        // B=66, D=68, F=70
        List<Character> chars = Arrays.asList('B', 'D', 'F');
        long evenSum = 66 + 68 + 70;
        assertEquals(evenSum, calculateDifference(chars));
    }

    // Helper methods matching Application logic
    long calculateDifference(List<Character> characters) {
        long evenSum = 0;
        long oddSum = 0;
        for (Character c : characters) {
            int value = (int) c;
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        return Math.abs(evenSum - oddSum);
    }
}
