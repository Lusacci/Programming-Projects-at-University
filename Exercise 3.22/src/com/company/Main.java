package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: point in a circle?
        /*1.) Prompt the user for a point (x,y)
          2.) Check if the point is within the circle centered at (0,0) radius = 10
          3.) Display the result*/

        //Get X and Y coordinates.
        Scanner input = new Scanner(System.in);
        System.out.println("Hey there! I can tell you if you're point is on the circle!");
        System.out.println("Keep in mind the circle is centered at (0,0) with a radius of 10.");
        System.out.println("Okay so give me the (x,y) coordinates! x first, then y.");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Gonna need the point slope formula here.
        double centerX = 0;
        double centerY = 0;


        double squareRootMe = (Math.pow((x - centerX), 2)) + (Math.pow((y - centerY),2));
        double distance = Math.pow(squareRootMe,.5);

        if(distance <= 10){
            System.out.println("Point (" + x + " ," + y + ") is in the circle.");
        }
        else {
            System.out.println("Point (" + x + " ," + y + ") is not in the circle.");
        }
    }
}
