package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x coordinate value: ");
        int x = scanner.nextInt();
        System.out.println("Enter y coordinate value: ");
        int y = scanner.nextInt();

        double xSquare = Math.pow(x, 2);
        double ySquare = Math.pow(y, 2);

        double distance = Math.sqrt(xSquare + ySquare);
        System.out.println("\nEuclidean distance = " + distance);
    }
}
