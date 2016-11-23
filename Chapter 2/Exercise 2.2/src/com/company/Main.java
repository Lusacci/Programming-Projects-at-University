package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Compute the volume of a cylinder.
        /* 1.) Reads in the radius and length of a cylinder
           2.) Compute the area and volume
           3.) Display results */
        final double pi = 3.14159; // this is pi

        //  Prompt
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I calculate the volume of a cylinder ;) ");

        // User Radius
        System.out.println("Hi there! please enter a value for the radius!");
        double radius = input.nextDouble();

        // User Length
        System.out.println("Now give me one for the length! :D");
        double length = input.nextDouble();

        //Calculate area to volume.
        double area = pi * radius * radius;
        double volume = area * length;

        // Display.
        System.out.println("The area is: " + area);
        System.out.println("Okay so the volume of the cylinder is: " + volume);


    }
}
