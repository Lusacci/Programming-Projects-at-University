package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Health Application
        /*1.) Prompt the user to enter in a weight(pounds) and height(feet and inches).
          2.) Calculate BMI
          3.) Display BMI */

        Scanner input = new Scanner(System.in);
        System.out.println("I calculate your BMI.");
        System.out.println("Please enter a weight in pounds.");
        double weight = input.nextDouble();

        System.out.println("Now give me your height feet and inches");
        double heightfeet = input.nextDouble();
        double heightInches = input.nextDouble();

        double height = (heightfeet * 12) + heightInches;

        final double KILOGRAMS_PER_POUND = .45359237;
        final double METERS_PER_INCH = .0254;

        double weightInKilo = KILOGRAMS_PER_POUND * weight;
        double heightInMeters = METERS_PER_INCH * height;

        double bmi = weightInKilo / (Math.pow(heightInMeters,2));

        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5){
            System.out.println("You need to eat more, you twig");
        }
        else if(bmi < 25){
            System.out.println("Okay you're normal");
        }
        else if(bmi < 30){
            System.out.println("You Chubby bastard.");
        }
        else{
            System.out.println("Sorry to say, but you sir, are American Fat. (hahaha! XD)");
        }
    }
}
