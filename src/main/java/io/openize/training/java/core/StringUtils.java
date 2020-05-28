package io.openize.training.java.core;

class StringUtils {

    public StringBuilder repeat(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb;
    }

    public String removeChars(String text, String deleteText) {
        for (char c : deleteText.toCharArray()) {
            text = text.replace(c, ' ');
        }
        return text;
    }

    public String toUpperCase(String text) {
        for (char c : text.toCharArray()) {
            text = text.toUpperCase();
        }
        return text;

    }

}
