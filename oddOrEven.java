package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number greater than 1");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput % 2 != 0) {
            System.out.println("NEW");
        }else if ((userInput % 2 == 0) && (userInput >= 2) && (userInput <= 5)) {
            System.out.println("OLD");
        }else if ((userInput % 2 ==0) && (userInput >= 6) && (userInput <= 30)) {
            System.out.println("NEW");
        }else if ((userInput % 2 == 0) && (userInput > 30)) {
            System.out.println("OLD");
        }else System.out.println("Invalid number");
    }
}
