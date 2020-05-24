package io.openize.training.java.core;

import java.util.Scanner;

class DeleteSymbolsInString {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text");
        try {
            String text = in.next();
            System.out.println("Enter a symbol");
            String deleteText = in.next();
            for (char c : deleteText.toCharArray()) {
                text = text.replace(c, ' ');
            }
            System.out.println(text);
        } catch (IllegalArgumentException e) {
            System.err.print(e.getMessage());
            System.err.print("Exception was processed. Program continues");

        }

    }
}