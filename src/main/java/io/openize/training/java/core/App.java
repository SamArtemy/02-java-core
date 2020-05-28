package io.openize.training.java.core;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a text");
        String text = in.next();
        System.out.println("Enter a delete text");
        String deletedText = in.next();
        System.out.println("Enter a count");
        int count = in.nextInt();
        System.out.println("Results");

        try {
            System.out.println(stringUtils.repeat(text, count));
            System.out.println(stringUtils.removeChars(text, deletedText));
            System.out.println(stringUtils.toUpperCase(text));
        } catch (IllegalArgumentException e) {
            System.err.print(e.getMessage());
            System.err.print("Exception was processed. Program continues");

        }
    }
}