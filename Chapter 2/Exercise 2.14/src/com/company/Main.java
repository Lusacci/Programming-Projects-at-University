package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Health Application: computing BMI
        /* 1.) Prompt the user to enter a weight in pounds.
         * 2.) Prompt the user to enter a height in inches.
         * 3.) Display the BMI (Body Mass Index)*/

        Scanner input = new Scanner(System.in);
        System.out.println("Hello human, I am a health application for computing BMI.");
        System.out.println("Please enter your weight in pounds.");
        double weight = input.nextDouble();

        System.out.println("Please enter your height in inches: ");
        double height = input.nextDouble();

        //Conversion
        double kiloweight = weight * 0.45359237;
        double meterheight = height * 0.0254;
        double centimeterheight = meterheight * 100;
        double bmi = kiloweight / Math.pow(meterheight,2);

        System.out.println("So your BMI is: " + bmi);
    }
}
