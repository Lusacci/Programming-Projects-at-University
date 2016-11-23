package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Physics: finding runaway length
        /*1.) Prompt the user to enter in the velocity (m/s)
          2.) Prompt the user to enter in the acceleration (m/s^2) */
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings human! I calculate the minimum runway length");
        System.out.println("Please enter the velocity (m/s)");
        double v = input.nextDouble();

        System.out.println("Please enter in the amount for acceleration.");
        double a = input.nextDouble();

        double minRunwayLength = Math.pow(v , 2) / (2 * a);
        System.out.println("The minimum runway length for this airplane: " + minRunwayLength);


    }
}
