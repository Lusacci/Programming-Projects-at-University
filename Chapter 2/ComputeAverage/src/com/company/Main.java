package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Compute the Average of these 3 numbers.
        System.out.println("Hi there! I caculate the average of 3 numbers! :)");
        System.out.println("Enter your first number! ;)");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        System.out.println("Now give me your second number.");
        double number2 = input.nextDouble();
        System.out.println("Last number! :D");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("So your average is going to be: " + average );
    }
}
