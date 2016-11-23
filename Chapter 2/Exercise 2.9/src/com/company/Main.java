package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Physics: acceleration
        /*1.) Prompt the user to enter the starting velocity in meters/second.
          2.) Prompt the user to enter the ending velocity in meters/second
          3.) Prompt the user to enter the time span in seconds
          4.) Calculate and display the average acceleration*/
        Scanner input = new Scanner (System.in);
        //1st prompt the starting velocity
        System.out.println("Hi there! I calculate the acceleration.");
        System.out.println("Please enter in a starting velocity (units will be meters per second)");
        double v0 = input.nextDouble();

        //2nd prompt the ending velocity
        System.out.println("Now please enter the ending velocity (same units)");
        double v1 = input.nextDouble();

        //3rd prompt the time span.
        System.out.println("So how long is the acceleration for? (seconds)");
        double t = input.nextDouble();

        //Calculate the acceleration
        double acceleration = (v1 - v0) / t;

        System.out.println("The average acceleration is: " + acceleration + " meters per second.");

    }
}
