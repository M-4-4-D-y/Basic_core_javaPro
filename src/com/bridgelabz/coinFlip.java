package com.bridgelabz;

import java.util.Scanner;

public class coinFlip {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Flip the coin numbers of times : ");
        int number = scanner.nextInt();
        int totalCount=0,countHeads=0,countTails=0;
        for(int i=0;i<number; i++)
        {
            if (Math.random() < 0.5) //Math random function if less then 0.5 it will print Head or else Tail
            {
                countHeads++;
            } else
            {
                countTails++;
            }
            totalCount++;
        }
        System.out.println("Numbers of Heads: "+countHeads);
        System.out.println("Numbers of Tails: "+countTails);
        float Head = (float)((countHeads % totalCount) * 10);
        float Tails = (float)((countTails % totalCount) * 10);
        System.out.println("Percentage of Head : " +Head+"%");
        System.out.println("Percentage of Tail : " +Tails+"%");
    }
}


