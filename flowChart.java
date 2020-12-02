package com.taskTwo3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;
        int avg;
        System.out.println("Please enter 3 numbers:");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        avg = (a+b+c)/3;
        System.out.println("avg = " + avg);

        if ((avg > a) && (avg > b) && (avg > c)) {
            System.out.println("avg is higher than all three numbers");
        }else if ((avg > a) && (avg > b) && (avg <= c)) {
            System.out.println("avg is higher than first and second numbers");
        }else if ((avg > a) && (avg <= b) && (avg > c)) {
            System.out.println("avg is higher that first and third numbers");
        }else if ((avg <= a) && (avg > b) && (avg > c)) {
            System.out.println("avg is higher than second and third numbers");
        }else if ((avg > a) && (avg <= b) && (avg <= c)) {
            System.out.println("avg is just higher than first number");
        }else if ((avg <= a) && (avg > b) && (avg <= c)) {
            System.out.println("avg is just higher than second number");
        }else if ((avg <= a) && (avg <= b) && (avg > c)) {
            System.out.println("avg is just higher than third number");
        }else System.out.println("you entered same numbers all three times");
    }
}
