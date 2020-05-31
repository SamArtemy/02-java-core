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
            char newText = text.charAt(i);
            boolean shouldBeRemoved = false;
            for (int j = 0; j < symbols.length(); j++) {
                char newSymbols = symbols.charAt(j);
                if (newText == newSymbols) {
                    shouldBeRemoved = true;
                    text.contains(symbols);
                }
            }
            if (shouldBeRemoved == false) {
                sb.append(newText);
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




