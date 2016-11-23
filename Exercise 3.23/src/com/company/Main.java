package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Geometry: point in a Rectangle?
        /*1.) Prompt user for coordinates.
          2.) Check whether point is inside the rectangle with width of 10 and height of 5.
          3.) Display results.*/

        // Prompt the coordinates.
        Scanner input = new Scanner(System.in);
        System.out.println("Hey there! I can tell you if you're point is on the rectangle!");
        System.out.println("Keep in mind the rectangle is centered at (0,0) with a width of 10 and height of 5.");
        System.out.println("Okay so give me the (x,y) coordinates! x first, then y.");
        double x = input.nextDouble();
        double y = input.nextDouble();


        // Gonna need the point slope formula here.
        double centerX = 0;
        double centerY = 0;

        //Horizontal Distance
        double horizontalD = x - centerX;
        double verticalD = y - centerY;

        // distance formula from given point to the center.
        // double squareRootMe = (Math.pow((horizontalD), 2)) + (Math.pow((verticalD),2));
        // double distance = Math.pow(squareRootMe,.5);

        // need to check vertical and horizontal distance, we can do this from initial coordinates.
        if((horizontalD <= 10.0 /2) && (verticalD <= 5.0 / 2)){
            System.out.println("Point (" + x + " ," + y + ") is in the rectangle.");
        }
        else {
            System.out.println("Point (" + x + " ," + y + ") is not in the rectangle.");
        }
    }
}
