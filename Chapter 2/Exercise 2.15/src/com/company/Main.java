package com.company;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	// Geometry: distance of two points
        /*1.) Prompt the user to enter in two points
          2.) Compute the distance
          3.) Display the distance */
        Scanner input = new Scanner (System.in);
        System.out.println("Greetings human, I calculate the distance between 2 points");
        System.out.println("Enter in x1 and y1.");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter in x2 and y2.");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double xCo = x2 - x1;
        double yCo = y2 - y1;
        double innerDistance = Math.pow((xCo) , 2) + Math.pow((yCo) , 2);
        double distance = Math.pow(innerDistance, .5);

        System.out.println("The distance is: " + distance);

    }


}
