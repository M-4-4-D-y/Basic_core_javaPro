package com.bridgelabz;

import java.util.Scanner;

public class QuotientRmainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = scanner.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
