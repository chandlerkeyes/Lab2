package com.company;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        //create Lab2Methods object to use its class & declare variables
        Lab2Methods object = new Lab2Methods();
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        char yOrN = ' ';
        String userName = " ";
        //first, ask user's name
        System.out.println("Enter your name:");
        userName = keyboard.nextLine();
        //loop will iterate if the user enters 'y' or 'Y'
        do {
            System.out.println(userName + ", enter a number between 1 and 100:");
            userInput = keyboard.nextInt();

            object.evenOdd(userInput);

            System.out.println("Continue? (y/n)");
            yOrN = keyboard.next().charAt(0);
        } while ((yOrN == 'y') || (yOrN == 'Y'));
    }
}