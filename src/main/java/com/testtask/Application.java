package com.testtask;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Character> charactersList = Listener.getCharactersList();

        long evenSum = 0;
        long oddSum = 0;

        for (Character c : charactersList) {
            int value = (int) c;
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        long difference = evenSum - oddSum;
        System.out.println("Even symbols: " + evenSum);
        System.out.println("Odd symbols: " + oddSum);
        System.out.println("Difference: " + Math.abs(difference));
    }
}
