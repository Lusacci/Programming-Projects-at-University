package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Sum the digits in an integer
        /*1.) Prompt the user to give an integer between 0 - 1000
          2.) Add all the digits in the integer
          3.) Display results*/
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I calculate the sum of the digits in an integer");
        System.out.println("Please give me a number between 0-1000.");
        int number = input.nextInt();

        int digit1 = number % 10;
        int move1digit = number / 10; 
        int digit2 = move1digit % 10;
        int move2Digits = number / 100;
        int digit3 = move2Digits % 10;
        int total = digit1 + digit2 + digit3 ;

        System.out.println("The sum of the digits is: " + total);

    }
}
