package com.company;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	// Geometry: 2 circles
        /*Prompt the user to enter the coordinates of the center and radius of 2 circles
        * Determine whether the 2nd circle is inside, overlaps, or is not overlapping the 1st.
        * Display those results.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y- coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();


        System.out.println("Enter circle2's center x-, y- coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        //So now that we have 2 points, let's calculate the distance between them.
        double innerdformula = Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1), 2);
        double distance = Math.pow(innerdformula, .5);

        //We are going to use this distance to check if r2 is inside r1, r2 overlaps r1, and r2 doesn't overlap r1.

        if(distance <= Math.abs(r1 - r2)){
            System.out.println("circle2 is inside circle1.");
        }
        else if(distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1.");
        }
        else{
            System.out.println("circle2 doesn't overlap circle1.");
        }

    }
}
