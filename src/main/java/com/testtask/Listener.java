package com.testtask;

import java.util.*;

public class Listener {
    private Listener() {
    }

    private static String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your text: ");
        String text = scanner.next();
        return text.toUpperCase();
    }

    public static List<Character> getCharactersList() {
        String text = getText();
        char[] chars = text.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char c : chars) {
            characterList.add(c);
        }
        return characterList;
    }
}
