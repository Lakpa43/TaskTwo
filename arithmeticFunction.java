package com.Lakpa;

import java.util.Scanner;

public class Main {
    private static int userChoice;
    private static double x;
    private static double y;

    public static void main(String[] args) {
        System.out.println("Please enter 1 for Addition");
        System.out.println("Please enter 2 for Subtraction");
        System.out.println("Please enter 3 for Division");
        System.out.println("Please enter 4 for Multiplication");
        System.out.println("Please enter 5 for Average");

        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Please enter first number:");
                x = scanner.nextInt();
                System.out.println("Please enter second number:");
                y = scanner.nextInt();

                double totalAdd = x + y;
                System.out.println("Result = " + totalAdd);
                if (totalAdd < 0) System.out.println("Oops option 1 is returning negative number");
                break;

            case 2:
                System.out.println("Please enter first number:");
                x = scanner.nextInt();
                System.out.println("Please enter second number:");
                y = scanner.nextInt();

                double totalSubtract = x - y;
                System.out.println("Result = " + totalSubtract);
                if (totalSubtract < 0) System.out.println("Oops option 2 is returning negative number");
                break;

            case 3:
                double totalDivide = x / y;
                System.out.println("Please enter first number:");
                x = scanner.nextInt();
                System.out.println("Please enter second number:");
                y = scanner.nextInt();

                System.out.println("Result = " + totalDivide);
                if (totalDivide < 0) System.out.println("Oops option 3 is returning negative number");
                break;

            case 4:
                System.out.println("Please enter first number:");
                x = scanner.nextInt();
                System.out.println("Please enter second number:");
                y = scanner.nextInt();

                double totalMultiply = x * y;
                System.out.println("Result = " + totalMultiply);
                if (totalMultiply < 0) System.out.println("Oops option 4 is returning negative number");
                break;

            case 5:
                System.out.println("Please enter first number:");
                x = scanner.nextInt();
                System.out.println("Please enter second number:");
                y = scanner.nextInt();

                double totalAverage = (x+y)/2;
                System.out.println("Result = " + totalAverage);
                if (totalAverage < 0) System.out.println("Oops option 5 is returning negative number");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
