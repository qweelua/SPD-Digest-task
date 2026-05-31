package com.testtask;

import java.util.Scanner;

public class Listener {

    private Listener() {
    }

    private static String getText() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Put your text: ");
            String text = scanner.nextLine();
            return text.toUpperCase();
        }
    }

    public static java.util.List<Character> getCharactersList() {
        String text = getText();
        return text.chars()
                .mapToObj(c -> (char) c)
                .toList();
    }
}
