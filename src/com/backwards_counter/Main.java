package com.backwards_counter;

public class Main {

    public static void main(String[] args) {
        // A simple program that counts backwards and prints numbers or words based on divisibility.

        /*
         * Write a program in Python or Java that counts backwards from 100 to 1 and prints:
         * “Agile” if the number is divisible by 5,
         * “Software” if the number is divisible by 3,
         * “Testing” if the number is divisible by both,
         * or prints just the number if none of those cases are true.
         */

        for (int i = 100; i > 0 ; i--) {

            if (i % 3 == 0 || i % 5 == 0) { // divisible by 3 or 5 or both
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("Testing"); // by 3 and 5
                    } else {
                        System.out.println("Software"); // by 3
                    }
                } else {
                    System.out.println("Agile"); // by 5
                }
            } else { // not divisible
                System.out.println(i);
            }

        }
    }
}
