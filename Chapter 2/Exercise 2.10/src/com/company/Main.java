package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Science: Calculating Energy
        /*1.) Prompt the user to enter an amount in kilograms
          2.) Prompt the initial temperature (Celsius)
          3.) Prompt the final temperature
          4.) Calculate the energy
          5.) Display the results */
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings Human, I calculate the energy in joules");
        System.out.println("Please enter a value in for kilograms.");
        double kilograms = input.nextDouble();

        System.out.println("Please enter a value in for initial temperature (Celsius Please)");
        double initialTemp = input.nextDouble();

        System.out.println("Please enter a value in for the final temperature (same measurement type)");
        double finalTemp = input.nextDouble();

        double energy = kilograms * (finalTemp - initialTemp) * 4184;

        System.out.println("So the energy is: " + energy + " joules.");
    }
}
