package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Cost of Driving
        /* 1.) Prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon,
        and price per gallon.
           2.) calculate the cost of the trip
           3.) display it*/
        Scanner input = new Scanner(System.in);
        System.out.println("I will calculate cost of driving.");
        System.out.println("So how many miles do ya gotta drive?");
        double miles = input.nextDouble();

        System.out.println("Miles per gallon?");
        double mpg = input.nextDouble();

        System.out.println("Price per gallon?");
        double ppg = input.nextDouble();

        double cost = miles / mpg * ppg;

        System.out.println("So your cost comes out to: $" + cost);
    }
}
