package com.company;

/**
 * Created by chand on 6/21/2017.
 */
public class Lab2Methods {
    public static void evenOdd(int userInput) {
        if (userInput > 100) {
            System.out.println("Must enter a number between 1 - 100.");
        } else if ((userInput % 2 == 1) && (userInput > 60)) {
            System.out.println("Odd and over 60");
        } else if (userInput % 2 == 1) {
            System.out.println(userInput + " odd");
        } else if ((userInput % 2 == 0) && (userInput >= 2) && (userInput < 25)) {
            System.out.println("Even and less than 25");
        } else if ((userInput % 2 == 0) && (userInput >= 26) && (userInput <= 60)) {
            System.out.println("Even");
        } else if ((userInput % 2 == 0) && (userInput > 60)) {
            System.out.println(userInput + " even");
        } else {
            System.out.println("All numbers entered must be positive and within the range of 1 - 100.");
        }
    }
}