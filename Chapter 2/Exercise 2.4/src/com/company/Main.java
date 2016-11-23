package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Convert pounds into kilograms.
        /*1.) Prompt user to enter a number in pounds
          2.) conversion to kilograms (One pound is .454 kilograms)
          3.) display the result.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I convert pounds into kilograms. Please give me pounds: ");
        double pounds = input.nextDouble();

        // Converted
        double kilograms = pounds * 0.454;

        //Now to display.
        System.out.println("Your given pounds: " + pounds + " is equivalent to: " + kilograms + " kilograms.");

    }
}
