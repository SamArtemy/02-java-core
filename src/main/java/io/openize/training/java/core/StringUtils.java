package io.openize.training.java.core;

class StringUtils {


    public String repeat(String text, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

    String removeChars(String text, String symbols) {
        StringBuilder sb = new StringBuilder();

        char[] rmString = text.toCharArray();
        char[] rmSymbol = symbols.toCharArray();
        for (int i = 0; i < rmString.length; i++) {
            boolean shouldBeRemoved = false;
            for (int j = 0; j < symbols.length(); j++) {
                if (rmString[i] == rmSymbol[j]) {
                    shouldBeRemoved = true;
                }
            }
            if (shouldBeRemoved == false) {
                sb.append(rmString[i]);
            }
        }
        return sb.toString();
    }


    public String toUpperCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            sb.append(String.valueOf(c).toUpperCase());
        }
        return sb.toString();
    }

}




