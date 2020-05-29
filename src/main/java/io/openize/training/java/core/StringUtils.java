package io.openize.training.java.core;

public class StringUtils {


    String repeat(String text, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

    String removeChars(String text, char symbol) {
        StringBuilder sb = new StringBuilder();

        char[] rmString = text.toCharArray();
        for (int i = 0; i < rmString.length; i++) {
            if (rmString[i] == symbol) {
            } else {
                sb.append(rmString[i]);
            }
        }
        return sb.toString();
    }

    String toUpperCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            sb.append(String.valueOf(c).toUpperCase());
        }
        return sb.toString();
    }

}




