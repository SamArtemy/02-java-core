package io.openize.training.java.core;

import java.util.Scanner;

class StringUtils {

    public static void main(String[] arg) {
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text");
        try {
            String text = in.next();
            Integer count = in.nextInt();
            for (int i = 0; i < count; i++) {
                sb.append(text);
            }
            System.out.println(sb.toString());
        } catch (IllegalArgumentException e) {
            System.err.print(e.getMessage());
            System.err.print("Exception was processed. Program continues");

        }
    }
}
