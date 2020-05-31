package io.openize.training.java.core;

class StringUtils {


    public String repeat(String text, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

    public String removeChars(String text, CharSequence symbols) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            boolean shouldBeRemoved = false;
            for (int j = 0; j < symbols.length(); j++) {
                char deleteSymbol = symbols.charAt(j);
                if (symbol == deleteSymbol) {
                    shouldBeRemoved = true;
                    text.contains(symbols);
                }
            }
            if (shouldBeRemoved == false) {
                sb.append(symbol);
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




