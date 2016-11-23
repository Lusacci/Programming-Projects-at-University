package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Simple if Demo.
        /* 1.) Prompt the user to enter an integer.
           2.) If the input by the user is a multiple of 5, display high 5
           3.) If the input by the user is even, display high even.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Hi there! I use selection statements.");
        System.out.println("Please enter an integer");
        int userInput = input.nextInt();

        if (userInput % 5 == 0) {
            System.out.println("High Five");
        }
        if (userInput % 2 == 0){
            System.out.println("High Even");
        }
    }
}
