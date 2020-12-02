package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number and enter negative number to quit");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        while (true) {
            if (userInput >= 0) {
                System.out.println("Good Going");
                userInput = scanner.nextInt();
            } else {
                System.out.println("it's Over");
                System.exit(1);
            }
        }
    }
}
