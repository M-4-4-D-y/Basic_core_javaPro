package com.bridgelabz;

import java.util.Scanner;

public class swap_numbers {
    static void swapTwoNumbers()
    {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = scanner.nextInt();
        System.out.println("Before Swaping");
        System.out.println("First Number : "+num1);
        System.out.println("Second Number : "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swaping");
        System.out.println("First Number : "+num1);
        System.out.println("Second Number : "+num2);
    }
    public static void main(String[] args)
    {
        swapTwoNumbers();
    }
}
