package com.testtask;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Character> charactersList = Listener.getCharactersList();
        Map<Integer, Character> evenCharacters = charactersList.stream()
                .distinct()
                .filter((c) -> (int) c % 2 == 0)
                .collect(Collectors.toMap((c) -> (int) c, (c) -> c));
        Map<Integer, Character> oddCharacters = charactersList.stream()
                .distinct()
                .filter((c) -> (int) c % 2 != 0)
                .collect(Collectors.toMap((c) -> (int) c, (c) -> c));
        System.out.println("Even symbols: " + evenCharacters);
        System.out.println("Odd symbols: " + oddCharacters);
        Integer evenNumbersSum = evenCharacters.keySet().stream().reduce((c1, c2) -> c1 + c2).orElse(0);
        Integer oddNumbersSum = oddCharacters.keySet().stream().reduce((c1, c2) -> c1 + c2).orElse(0);
        int difference = evenNumbersSum - oddNumbersSum;
        if (difference <= 0) System.out.println("Difference: " + difference * -1);
        else System.out.println("Difference: " + difference);
    }
}
