package io.openize.training.java.core;

import java.util.Scanner;

public class ConvertToStringUppercase {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text");
        try {
            String text = in.next();
            System.out.println("Result");
            for (char c : text.toCharArray()) {
                text = text.toUpperCase();
            }
            System.out.println(text);
        } catch (IllegalArgumentException e) {
            System.err.print(e.getMessage());
            System.err.print("Exception was processed. Program continues");
        }
    }
}
