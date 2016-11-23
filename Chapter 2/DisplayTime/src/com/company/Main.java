package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Display Time
        Scanner input = new Scanner(System.in);

        //Prompt
        System.out.println("Hi there! Enter a value for seconds: ");

        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
