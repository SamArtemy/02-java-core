package io.openize.training.java.core;

class StringUtils {


    public String repeat(String text, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

    public String removeChars(String text, char symbol) {
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


    public String toUpperCase(String text) {
        text = text.toUpperCase();
        return text;
    }
}




